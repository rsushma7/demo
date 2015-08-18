package answer1;


import java.io.IOException;
import java.sql.Connection;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ans1
 */
@WebServlet("/Ans1")
public class Ans1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Ans1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try
			{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			String s=request.getParameter("val");
				Statement st=con.createStatement();
				String sql="select name,id,dept_name,tot_credits from student where name like %"+s+"%";
				ResultSet rs=st.executeQuery(sql);
				
				while(rs.next())
				{	
					System.out.println(rs.getString(1)+rs.getInt(2)+rs.getString(3)+rs.getInt(4));
				}
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
		
	

}
