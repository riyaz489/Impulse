package org.apache.jsp.lauth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" <html>\n");
      out.write("<head> <link rel=\"stylesheet\" type=\"text/css\" href=\"new2.css\"/>\n");
      out.write("<title>form</title></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"hed\">Register Now!!!</div> \n");
      out.write("\n");
      out.write("Be cool and join today.Meet millions <form action=\"demo\" method=\"post\">\n");
      out.write("<div id=\"tf\">\n");
      out.write(" &nbsp;<input type=\"text\" name=\"na1\" placeholder=\"First name\"/> &nbsp;\n");
      out.write("<input type=\"text\" name =\"nb2\"placeholder=\"Last name\"/><br>\n");
      out.write(" &nbsp; &nbsp;<input type=\"email\" name=\"m1\" placeholder=\"Your Email\"/><br>\n");
      out.write(" &nbsp; &nbsp;<input type=\"password\" name=\"p1\" placeholder=\"Password\"/><br>\n");
      out.write(" &nbsp; &nbsp;<legend><b>Date of Birth</b></legend>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <select name=\"d\">\n");
      out.write("\t<option selected disabled hidden value=\"-\">Day</option>\n");
      out.write("\t<option value=\"1\">1</option>\n");
      out.write("\t<option value=\"2\">2</option>\n");
      out.write("\t<option value=\"3\">3</option>\n");
      out.write("\t<option value=\"4\">4</option>\n");
      out.write("\t<option value=\"5\">5</option>\n");
      out.write("\t<option value=\"6\">6</option>\n");
      out.write("\t<option value=\"7\">7</option>\n");
      out.write("\t<option value=\"8\">8</option>\n");
      out.write("\t<option value=\"9\">9</option>\n");
      out.write("\t<option value=\"10\">10</option>\n");
      out.write("\t<option value=\"11\">11</option>\n");
      out.write("\t<option value=\"12\">12</option>\n");
      out.write("\t<option value=\"13\">13</option>\n");
      out.write("\t<option value=\"14\">14</option>\n");
      out.write("\t<option value=\"15\">15</option>\n");
      out.write("\t<option value=\"16\">16</option>\n");
      out.write("\t<option value=\"17\">17</option>\n");
      out.write("\t<option value=\"18\">18</option>\n");
      out.write("\t<option value=\"19\">19</option>\n");
      out.write("\t<option value=\"20\">20</option>\n");
      out.write("\t<option value=\"21\">21</option>\n");
      out.write("\t<option value=\"22\">22</option>\n");
      out.write("\t<option value=\"23\">23</option>\n");
      out.write("\t<option value=\"24\">24</option>\n");
      out.write("\t<option value=\"25\">25</option>\n");
      out.write("\t<option value=\"26\">26</option>\n");
      out.write("\t<option value=\"27\">27</option>\n");
      out.write("\t<option value=\"28\">28</option>\n");
      out.write("\t<option value=\"29\">29</option>\n");
      out.write("\t<option value=\"30\">30</option>\n");
      out.write("\t<option value=\"31\">31</option>\n");
      out.write("</select>\n");
      out.write(" <select name=\"m\">\n");
      out.write("\t<option value=\"-\" disabled hidden selected>Month</option>\n");
      out.write("\t<option value=\"1\">January</option>\n");
      out.write("\t<option value=\"2\">Febuary</option>\n");
      out.write("\t<option value=\"3\">March</option>\n");
      out.write("\t<option value=\"4\">April</option>\n");
      out.write("\t<option value=\"5\">May</option>\n");
      out.write("\t<option value=\"6\">June</option>\n");
      out.write("\t<option value=\"7\">July</option>\n");
      out.write("\t<option value=\"8\">August</option>\n");
      out.write("\t<option value=\"9\">September</option>\n");
      out.write("\t<option value=\"10\">October</option>\n");
      out.write("\t<option value=\"11\">November</option>\n");
      out.write("\t<option value=\"12\">December</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write(" <select  name=\"y\">\n");
      out.write("\t<option value=\"-\" disabled hidden selected>Year</option>\n");
      out.write("\t<option value=\"2017\">2017</option>\n");
      out.write("        <option value=\"2016\">2016</option>\n");
      out.write("         <option value=\"2015\">2015</option>\n");
      out.write("        <option value=\"2014\">2014</option>\n");
      out.write("         <option value=\"2013\">2013</option>\n");
      out.write("         <option value=\"2012\">2012</option>\n");
      out.write("        <option value=\"2011\">2011</option>\n");
      out.write("\t<option value=\"2010\">2010</option>\n");
      out.write("\t<option value=\"2009\">2009</option>\n");
      out.write("\t<option value=\"2008\">2008</option>\n");
      out.write("\t<option value=\"2007\">2007</option>\n");
      out.write("\t<option value=\"2006\">2006</option>\n");
      out.write("\t<option value=\"2005\">2005</option>\n");
      out.write("\t<option value=\"2004\">2004</option>\n");
      out.write("\t<option value=\"2003\">2003</option>\n");
      out.write("\t<option value=\"2002\">2002</option>\n");
      out.write("\t<option value=\"2001\">2001</option>\n");
      out.write("\t<option value=\"2000\">2000</option>\n");
      out.write("\t<option value=\"1999\">1999</option>\n");
      out.write("\t<option value=\"1998\">1998</option>\n");
      out.write("\t<option value=\"1997\">1997</option>\n");
      out.write("\t<option value=\"1996\">1996</option>\n");
      out.write("\t<option value=\"1995\">1995</option>\n");
      out.write("\t<option value=\"1994\">1994</option>\n");
      out.write("\t<option value=\"1993\">1993</option>\n");
      out.write("\t<option value=\"1992\">1992</option>\n");
      out.write("\t<option value=\"1991\">1991</option>\n");
      out.write("\t<option value=\"1990\">1990</option>\n");
      out.write("\t<option value=\"1989\">1989</option>\n");
      out.write("\t<option value=\"1988\">1988</option>\n");
      out.write("\t<option value=\"1987\">1987</option>\n");
      out.write("\t<option value=\"1986\">1986</option>\n");
      out.write("\t<option value=\"1985\">1985</option>\n");
      out.write("\t<option value=\"1984\">1984</option>\n");
      out.write("\t<option value=\"1983\">1983</option>\n");
      out.write("\t<option value=\"1982\">1982</option>\n");
      out.write("\t<option value=\"1981\">1981</option>\n");
      out.write("\t<option value=\"1980\">1980</option>\n");
      out.write("\t<option value=\"1979\">1979</option>\n");
      out.write("\t<option value=\"1978\">1978</option>\n");
      out.write("\t<option value=\"1977\">1977</option>\n");
      out.write("\t<option value=\"1976\">1976</option>\n");
      out.write("\t<option value=\"1975\">1975</option>\n");
      out.write("\t<option value=\"1974\">1974</option>\n");
      out.write("\t<option value=\"1973\">1973</option>\n");
      out.write("\t<option value=\"1972\">1972</option>\n");
      out.write("\t<option value=\"1971\">1971</option>\n");
      out.write("\t<option value=\"1970\">1970</option>\n");
      out.write("\t<option value=\"1969\">1969</option>\n");
      out.write("\t<option value=\"1968\">1968</option>\n");
      out.write("\t<option value=\"1967\">1967</option>\n");
      out.write("\t<option value=\"1966\">1966</option>\n");
      out.write("\t<option value=\"1965\">1965</option>\n");
      out.write("\t<option value=\"1964\">1964</option>\n");
      out.write("\t<option value=\"1963\">1963</option>\n");
      out.write("\t<option value=\"1962\">1962</option>\n");
      out.write("\t<option value=\"1961\">1961</option>\n");
      out.write("\t<option value=\"1960\">1960</option>\n");
      out.write("\t<option value=\"1959\">1959</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write(" &nbsp; &nbsp;<input type=\"radio\" value=\"m\" name=\"sex\"/>Male\n");
      out.write("<input type=\"radio\" value=\"f\" name=\"sex\"/>Female <br>\n");
      out.write(" &nbsp; &nbsp;<input type=\"text\" placeholder=\"Your college ID\" name=\"rollno\"/><br><br>\n");
      out.write(" &nbsp; &nbsp;<input type=\"text\" placeholder=\"Your City\" name=\"city\"/><br><br>\n");
      out.write(" &nbsp; &nbsp;<input type=\"text\" placeholder=\"Your contact number\" name=\"contact\"/><br><br>\n");
      out.write(" &nbsp; &nbsp;<input type=\"text\" placeholder=\"Your Branch\" name=\"branch\"/> <br>\n");
      out.write("<br>\n");
      out.write("</div>\n");
      out.write("<a href=\"log1.jsp\">Already have an account?</a> <br>\n");
      out.write("<input type=\"submit\" value=\"Register Now\"/></form>\n");
      out.write("</body>\n");
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
