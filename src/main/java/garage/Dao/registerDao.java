package garage.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import garage.Module.login;
import garage.Module.register;


public class registerDao {
	
	public int create (List<register> lstr)
	{
		register r=lstr.get(0);
		int i=0;
		
		Connection con=DataSource.getConnection();
		
		try {
			PreparedStatement pstate=con.prepareStatement("insert into customer values(?,?,?,?,?,?)");
			pstate.setString(1,r.getName());
			pstate.setDouble(2,r.getMbNo());
			pstate.setString(3,r.getAddr());
			pstate.setString(4,r.geteMail());
			pstate.setString(5,r.getPass());
			pstate.setString(6,r.getrPass());
			
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
	
	public boolean validateData(List<login> lstlog) {
		
		boolean b=false;
		login lobj=lstlog.get(0);
		
		Connection con=DataSource.getConnection();
		
		try {
			PreparedStatement pstate=con.prepareStatement("select * from customer where eMail=? and pass=?");
			pstate.setString(1,lobj.geteMail());
			pstate.setString(2,lobj.getPass());
			ResultSet rs=pstate.executeQuery();
			
			if(rs.next())
			{
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}

}
