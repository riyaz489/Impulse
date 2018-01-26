package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \n");
      out.write("\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n");
      out.write("\n");
      out.write("\t\t<title>DIT IMPULSE</title>\n");
      out.write("\t\n");
      out.write("\t<meta name=\"description\" content=\"Examples for creative website header animations using Canvas and JavaScript\" />\n");
      out.write("\t\t\n");
      out.write("<meta name=\"keywords\" content=\"header, canvas, animated, creative, inspiration, javascript\" />\n");
      out.write("\t\t\n");
      out.write("<meta name=\"author\" content=\"Codrops\" />\n");
      out.write("\t\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"../favicon.ico\">\n");
      out.write("\t\t\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\" />\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\n");
      out.write("\t\t\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Raleway:200,400,800' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\t\t<!--[if IE]>\n");
      out.write("\t\t\n");
      out.write("<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\t<div class=\"container demo-1\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("                           \n");
      out.write("\t\t\t\n");
      out.write("<div id=\"large-header\" class=\"large-header\">\n");
      out.write("\n");
      out.write("<div id=\"hdr\">\n");
      out.write("    <a href=\"abt.jsp\">About Us</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("        \n");
      out.write("    <a href=\"gallery.jsp\">Gallery</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("      <a href=\"quiz.jsp\">Quiz</a> &nbsp;&nbsp;&nbsp;\n");
      out.write("         <a href=\"Career.jsp\">Career</a> &nbsp;&nbsp;&nbsp;\n");
      out.write("            <a href=\"team.jsp\">Team</a> &nbsp;&nbsp;&nbsp;\n");
      out.write("    <a href=\"con.jsp\">Contact Us</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("    <a href=\"login.jsp\">Sign up</a></div>&nbsp;&nbsp;\n");
      out.write("    <hr style=\"border-top: 1px solid rgba(252, 244, 101, 0.4);margin-top: 40px;margin-left: 32%;position: absolute;width: 50%\">\n");
      out.write("<canvas id=\"demo-canvas\"></canvas>\n");
      out.write("\n");
      out.write("<h1 class=\"main-title\">\n");
      out.write("    \n");
      out.write(" \n");
      out.write(" DIT IMPULSE<br> <span class=\"thin\">Storming the talent <br>within you.</span></h1></div>\n");
      out.write("  \n");
      out.write("<address> <div id=\"add\"> \n");
      out.write(" <img style=\"margin-top: 20px;\"src=\"dit.png\"><a href=\"https://www.dituniversity.edu.in/\"><br> DIT University<br> Mussorie-Diversion Road,<br>Dehradun,Uttarakhand-248009,India<br> 0135-3000300</a>\n");
      out.write("\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("  <div id=\"add2\">\n");
      out.write(" <br>\n");
      out.write(" <a  href=\"www.facebook.com/dit impulse\"><img style=\"margin-right: 9px;margin-top: 20px !important;\" src=\"f.png\" height=\"53px\" width=\"43\"></a>\n");
      out.write("<a href=\"www.youtube.com/dit impulse\"><img style=\"margin-right: 9px;margin-top: 5px !important\"  src=\"y.png\" height=\"49px\" width=\"47\"></a>\n");
      out.write("<a href=\"www.instagram.com/dit impluse\"><img src=\"I.png\" height=\"39px\" width=\"36\"></a>\n");
      out.write("\n");
      out.write("<br><br><br> Managed by:<br><br>IMPULSE TEAM<BR><BR><BR><br>\n");
      out.write(" For website related issues,please <a href=\"con.jsp\">contact us.</a>\t\n");
      out.write(" </div>  </address>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</div><!-- /container -->\n");
      out.write("\t\t<script src=\"js/TweenLite.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/EasePack.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("<script src=\"js/rAF.js\"></script>\n");
      out.write("\t\t<script src=\"js/demo-1.js\"></script>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
