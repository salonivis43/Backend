package feereport;
import java.sql.*;


public class connection {
	connection con;
	Statement stm;
	
	connection(){
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=(connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fee","root","Saloni@1234");
			stm=con.createStatement();
			if(con.isClosed())
			{
				System.out.println("not connect");
			}
			else
			{
				System.out.println("connect");
			}
			
			
		
	}

	



	catch(Exception e)
	{
		e.printStackTrace();
	}

}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}

	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		new connection();
	}
}
