package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
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

      out.write("\n");
      out.write("<style>\n");
      out.write("  body{   background-color: rgba(120,120,120,0.0);   \n");
      out.write("  }\n");
      out.write("  #hdr{\n");
      out.write("    \n");
      out.write("    position: absolute;\n");
      out.write("    margin-top: 0px;\n");
      out.write("    font-size: 1em;\n");
      out.write("    margin-left: 49%;\n");
      out.write("    \n");
      out.write("    padding-top: 13px;\n");
      out.write("     letter-spacing: 0.05em;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("a:hover {color:hotpink !important;}\n");
      out.write("a{color: white;\n");
      out.write("text-decoration:none;\n");
      out.write("font-family: arial;\n");
      out.write("font-weight: 100;}\n");
      out.write("a:visited{color:white;}\n");
      out.write("\n");
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
      out.write("    <hr style=\"border-top: 1px solid rgba(252, 244, 101, 0.4);margin-top: 33px;margin-left: 32%;margin-bottom: 100px !important;position: absolute;width: 50%\">\n");
      out.write("    ");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"new.css\"/>\n");
      out.write("<title>expert portal</title>\n");
      out.write("      <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(\n");
      out.write("$('#b3').click(function(){\n");
      out.write("    var value = $(this).jsp();\n");
      out.write("    if(value=='Big'){\n");
      out.write("        $(this).jsp('Small'); \n");
      out.write("        $('frm').css('width',\"100%\");\n");
      out.write("    }else{\n");
      out.write("    $(this).jsp('Big');\n");
      out.write("    $('frm').css('width',\"50%\");\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("})\n");
      out.write(")\n");
      out.write("</script>\n");
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
      out.write("   <div id=\"lnk\">\n");
      out.write("        <a style=\" margin-left:25px;margin-right:25px;\" href=\"login.jsp\">Student</a>\n");
      out.write("         <a style=\" margin-left:25px;margin-right:25px;\" href=\"l2.jsp\">Admin</a>\n");
      out.write("          <a  style=\" margin-left:25px;margin-right:25px;\" href=\"login3.jsp\">Expert</a>\n");
      out.write("           </div>\n");
      out.write("<div id=\"frm\"><iframe src=\"log3.jsp\" width=\"100%\" height=\"100%\" scrolling=\"auto\" frameborder=\"0\">\n");
      out.write("   \n");
      out.write("        Sorry your browser does not support inline frames.\n");
      out.write("</iframe></div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<div style=\"margin-top: 40%;\">");
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
