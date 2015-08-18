

import java.io.IOException;

import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");

			Statement st=con.createStatement();
			String sql="select *  from acc_info_table";
			ResultSet rs=st.executeQuery(sql);
			String no=request.getParameter("num");
			String type=request.getParameter("type");
		    String amt=request.getParameter("amt");
		    int anum=Integer.parseInt(no);
		    int amt1=Integer.parseInt(amt);
			int bal;
		    while(rs.next())
			{
				//System.out.println(rs.getInt(1)+" "+rs.getString(2));
				if(rs.getInt(1)==anum)
				{
					  PreparedStatement pstmt = con.prepareStatement("update acc_info_bal set balance=? where accno="+anum);
                      if(type.equals("Withdraw"))
                    	  bal=(rs.getInt(3))-amt1;
                      else
                          bal=(rs.getInt(3))+amt1;	  
                       
					  pstmt.setInt(1,bal);
                      int i = pstmt.executeUpdate();
                       System.out.println(i);
                       PreparedStatement pstmt1 = con.prepareStatement("insert into bank_user_trans values(?,?,?,?)");
                       pstmt1.setInt(1,anum);
                       pstmt1.setString(2,"04-july-2015");
                       pstmt1.setString(3,type);
                       pstmt1.setInt(4,amt1);
                       int i1 = pstmt1.executeUpdate();
                       System.out.println(i1);

				}
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	

}
