/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-08-17 09:42:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AddEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script>\r\n");
      out.write("function checkEno( )\r\n");
      out.write("{\r\n");
      out.write(" ");
	
 int no=0;
 try{
no=Integer.parseInt(request.getParameter("empno"));

      out.write("\r\n");
      out.write("document.write(no);\r\n");
      out.write(" ");
}

 catch(Exception e){}
Class.forName("oracle.jdbc.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Connection con=DriverManager.getConnection(url,"scott","tiger");
String s="select empno from employee";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(s);
while(rs.next())
{
if(rs.getInt(1)==no)
{
 
      out.write("\r\n");
      out.write(" \t<h1>Already present</h1>\r\n");
      out.write(" ");
}else{
 
      out.write("\r\n");
      out.write("\t<h1>Insert</h1>\r\n");
} 
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("if(window.XMLHttpRequest)\r\n");
      out.write("{\r\n");
      out.write("xmlhttp=new XMLHttpRequest();\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("}\r\n");
      out.write("xmlhttp.onreadystatechange=function()\r\n");
      out.write("{\r\n");
      out.write("if(xmlhttp.readyState==4 && xmlhttp.status==200)\r\n");
      out.write("{\r\n");
      out.write("document.getElementById(\"t\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("xmlhttp.open(\"GET\",\"GetData.jsp?q=\"+str,true);\r\n");
      out.write("xmlhttp.send();\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=form1 >\r\n");
      out.write("Enter the employee number:<input type=\"text\" name=\"empno\">\r\n");
      out.write("Enter the employee name:<input type=\"text\" name=\"empname\">\r\n");
      out.write("Enter the salary:<input type=\"text\" name=\"salary\">\r\n");
      out.write("<input type =\"submit\" onclick=\"checkEno()\">\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
