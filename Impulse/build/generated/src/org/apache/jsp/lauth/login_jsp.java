package org.apache.jsp.lauth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"new.css\"/>\n");
      out.write("<title>student portal</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"content\"><p ><h2>Make Cool  Freinds!!!</h2><br>\n");
      out.write("DIT Impulse is a IT Club that will help you to improve  yourself,This club website offers\n");
      out.write("Landing pages,News Feed,image/video Feed,Chat Box,Timeline and lot more.(please don't waste your time in reading this text\n");
      out.write("becoz it doesn't make any sense)\n");
      out.write("<br>\n");
      out.write("<div id=\"lin\">What are you waiting for?Become member now.</div> \n");
      out.write("\n");
      out.write("<input type=\"button\" value=\"Learn More\"/>\n");
      out.write("<br></p></div>\n");
      out.write("\n");
      out.write("    <div id=\"lnk\">\n");
      out.write("        <a href=\"login.jsp\"><button>Student</button></a>\n");
      out.write("         <a href=\"l2.jsp\"><button>Admin</button></a>\n");
      out.write("          <a href=\"login3.jsp\"><button>Expert</button></a>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("<div id=\"frm\"><iframe src=\"new.jsp\" width=\"100%\" height=\"100%\" scrolling=\"auto\" frameborder=\"0\">\n");
      out.write("   \n");
      out.write("        Sorry your browser does not support inline frames.\n");
      out.write("</iframe></div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
