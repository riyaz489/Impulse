package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(" address{height: 870px;\n");
      out.write("          background-color:#333333; \n");
      out.write("          width:100%;\n");
      out.write("         \n");
      out.write("          margin-top: 9%;\n");
      out.write("          margin-bottom: 1%;\n");
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
