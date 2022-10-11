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
import garage.Module.register;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public registerController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		double mbNo=Double.parseDouble(request.getParameter("mbNo"));
		String addr=request.getParameter("addr");
		String eMail=request.getParameter("eMail");
		String pass=request.getParameter("pass");
		String rPass=request.getParameter("rPass");
		
		register r=new register(name, mbNo, addr, eMail, pass, rPass);
		List<register> lstr=new ArrayList<register>();
		registerDao rDao=new registerDao();
		
		lstr.add(r);
		
		int i=rDao.create(lstr);
		if(i>0)
		{
			response.sendRedirect("loin.jsp");
		}
		else
		{
			response.sendRedirect("Error.jsp");
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
