

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Create
 */
@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

			
			String no=request.getParameter("num");
			String name=request.getParameter("name");
		    String amt=request.getParameter("amt");
		    int anum=Integer.parseInt(no);
		    int amt1=Integer.parseInt(amt);
			
                       PreparedStatement pstmt1 = con.prepareStatement("insert into acc_info_table values(?,?,?)");
                       pstmt1.setInt(1,anum);
                       pstmt1.setString(2,name);
                       pstmt1.setInt(3,amt1);
                       int i1 = pstmt1.executeUpdate();
                       System.out.println(i1);

			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	

}
