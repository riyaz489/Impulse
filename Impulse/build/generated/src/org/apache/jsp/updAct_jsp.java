package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updAct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/aheader.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div id=\"b1\"><head><link rel=\"stylesheet\" type=\"text/css\" href=\"newcss2.css\"></head>\n");
      out.write("<body><div class=\"head\">\n");
      out.write("   \n");
      out.write(" <Strong>   Admin Panel</Strong>\n");
      out.write("    <a  class=\"limg\"  href=\"admin.jsp\">Home</a>\n");
      out.write("         <a  class=\"limg\"  href=\"addact.jsp\">Add Account</a>\n");
      out.write("   <a  class=\"limg\"  href=\"showAct.jsp\">View Account</a>\n");
      out.write("   <a  class=\"limg\"  href=\"updAct.jsp\">Update Account</a>\n");
      out.write("    <a  class=\"limg\"  href=\"srch.jsp\">Search Account</a>\n");
      out.write("    <a  class=\"limg\"  href=\"logout\">Logout</a>\n");
      out.write("    </div></body>  </div>  \n");
      out.write("    \n");
      out.write("  \n");
      out.write('\n');
HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
            
      out.write("\n");
      out.write("            <head><style> body{\n");
      out.write("           background-color: #FFFFFF !important;\n");
      out.write("            background-size: 100% 51.4%;\n");
      out.write("         }\n");
      out.write("         input[type=\"submit\"]{\n");
      out.write("             color: whitesmoke;\n");
      out.write("             background-color: #222222;\n");
      out.write("             padding:4px;\n");
      out.write("             font-weight: 700;\n");
      out.write("             height: 30px;\n");
      out.write("             width: 90px;\n");
      out.write("             margin-top:7%;\n");
      out.write("             margin-left:25%;\n");
      out.write("             border-radius: 2em;\n");
      out.write("             border-width: 0px;\n");
      out.write("             margin-bottom: 14%;\n");
      out.write("             \n");
      out.write("             \n");
      out.write("         }</style></head>\n");
      out.write("           <body ><form action=\"updAct\" method=\"post\">\n");
      out.write("                   <h1 style=\"margin-left:20%;margin-top:1%;margin-bottom: 10%;\"> Update Admin Details</h1>\n");
      out.write("           \n");
      out.write("           <u style=\"font-weight: 600;font-size: 1.2em;margin-left: 25%;\">Enter  id : </u>\n");
      out.write("           <input style=\"margin-left: 3%;height:25px; \" type=\"text\" placeholder=\"enter your ID number\" name=\"id\">\n");
      out.write("           <br><input type=\"submit\" value=\"update\"></form>\n");
      out.write("               \n");
      out.write("               <form action=\"upd2Act\" method=\"post\">\n");
      out.write("                   <h1 style=\"margin-left:20%;margin-top:1%;margin-bottom: 10%;\"> Update Student Details</h1>\n");
      out.write("           \n");
      out.write("           <u style=\"font-weight: 600;font-size: 1.2em;margin-left: 25%;\">Enter  id : </u>\n");
      out.write("           <input style=\"margin-left: 3%;height:25px; \" type=\"text\" placeholder=\"enter your ID number\" name=\"id2\">\n");
      out.write("           <br><input type=\"submit\" value=\"update\"></form>\n");
      out.write("               \n");
      out.write("               <form action=\"upd3Act\" method=\"post\">\n");
      out.write("                   <h1 style=\"margin-left:20%;margin-top:1%;margin-bottom: 10%;\"> Update Expert Details</h1>\n");
      out.write("           \n");
      out.write("           <u style=\"font-weight: 600;font-size: 1.2em;margin-left: 25%;\">Enter  id : </u>\n");
      out.write("           <input style=\"margin-left: 3%;height:25px; \" type=\"text\" placeholder=\"enter your ID number\" name=\"id3\">\n");
      out.write("           <br><input type=\"submit\" value=\"update\"></form>\n");
      out.write("           </body>\n");
      out.write("           <div style=\"margin-top: 20%;\">");
      out.write("\n");
      out.write("\n");
      out.write("<style> *{\n");
      out.write("    margin-bottom: 0px;\n");
      out.write("    margin-left: 0px;\n");
      out.write("    margin-right: 0px;\n");
      out.write("}\n");
      out.write(" address{height: 570px;\n");
      out.write("          background-color:#333333; \n");
      out.write("          width:100%;\n");
      out.write("         \n");
      out.write("          margin-top: 9%;\n");
      out.write("          \n");
      out.write("      }\n");
      out.write("    #add{\n");
      out.write("color:#FFF;\n");
      out.write("text-align:center;\n");
      out.write("font-size:16px;\n");
      out.write("font-weight:lighter;\n");
      out.write("margin-top: 30px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#add2{ position:absolute;\n");
      out.write("\t  margin-top:30px;\n");
      out.write("      color:#FFF;\n");
      out.write("      margin-bottom:30px;\n");
      out.write("      text-align:center;\n");
      out.write("      background-color: #212121;\n");
      out.write("      width: 60%;\n");
      out.write("      left:20%;\n");
      out.write("      right:20%;\n");
      out.write("      height:300px;\n");
      out.write("      }\n");
      out.write("      a:hover {color:hotpink !important;}\n");
      out.write("a{color: white;\n");
      out.write("text-decoration:none;\n");
      out.write("font-family: arial;\n");
      out.write("font-weight: 100;}\n");
      out.write("a:visited{color:white;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<address> <div id=\"add\"> \n");
      out.write(" <img  style=\"margin-top:12px;\"src=\"dit.png\"><a href=\"https://www.dituniversity.edu.in/\"><br> DIT University<br> Mussorie-Diversion Road,<br>Dehradun,Uttarakhand-248009,India<br> 0135-3000300</a>\n");
      out.write("\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("  <div id=\"add2\">\n");
      out.write(" <br>\n");
      out.write(" <a  href=\"www.facebook.com/dit impulse\"><img style=\"margin-right: 9px;\" src=\"f.png\" height=\"53px\" width=\"43\"></a>\n");
      out.write("<a href=\"www.youtube.com/dit impulse\"><img style=\"margin-right: 9px;\"  src=\"y.png\" height=\"49px\" width=\"47\"></a>\n");
      out.write("<a href=\"www.instagram.com/dit impluse\"><img src=\"I.png\" height=\"39px\" width=\"36\"></a>\n");
      out.write("\n");
      out.write("<br><br><br> Managed by:<br><br>IMPULSE TEAM<BR><BR><BR>\n");
      out.write(" For website related issues,please <a href=\"con.jsp\">contact us.</a>\t\n");
      out.write(" </div>  </address>");
      out.write("\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
