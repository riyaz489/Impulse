package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("  body{   background-color: rgba(120,120,120,1.0);   \n");
      out.write("  }\n");
      out.write("  #hdr{\n");
      out.write("    \n");
      out.write("    position: absolute;\n");
      out.write("    margin-top: 0px;\n");
      out.write("    font-size: 1.1em;\n");
      out.write("    margin-left: 50%;\n");
      out.write("    padding-top: 16px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("a:hover {color:hotpink !important;}\n");
      out.write("a{color: white;\n");
      out.write("text-decoration:none;\n");
      out.write("font-family: arial;\n");
      out.write("font-weight: 100;}\n");
      out.write("a:visited{color:white;}\n");
      out.write("a:after{color: white;}\n");
      out.write("a:active{color:white;}\n");
      out.write("</style>\n");
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
      out.write("    <hr style=\"border-top: 1px solid rgba(252, 244, 101, 0.4);margin-top: 40px;margin-left: 32%;margin-bottom: 100px;position: absolute;width: 50%\">\n");
      out.write("    ");
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
