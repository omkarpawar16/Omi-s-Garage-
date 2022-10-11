package garage.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import garage.Dao.registerDao;
import garage.Module.login;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int logincnt=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String eMail=request.getParameter("eMail");
		String pass=request.getParameter("pass");
		
		login lobj=new login();
		lobj.seteMail(eMail);
		lobj.setPass(pass);
		
		List<login> lstlog=new ArrayList<login>();
		lstlog.add(lobj);
		
		registerDao rDao=new registerDao();
		
		boolean b=rDao.validateData(lstlog);
		
		if(b)
		{
			response.sendRedirect("home.jsp");
		}
		else
		{
			logincnt++;
			if(logincnt<3)
			{
				response.sendRedirect("login.jsp");
			}
			else
			{
				response.sendRedirect("Block.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
