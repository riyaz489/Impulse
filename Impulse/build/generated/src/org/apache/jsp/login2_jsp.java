package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"new.css\"/>\n");
      out.write("<title>Admin portal</title>\n");
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
      out.write("         <a href=\"login2.jsp\"><button>Admin</button></a>\n");
      out.write("          <a href=\"login3.jsp\"><button>Expert</button></a>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("<div id=\"frm\"><html>\n");
      out.write("<head> <link rel=\"stylesheet\" type=\"text/css\" href=\"new2.css\"/>\n");
      out.write("<title>form</title></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"hed\">Register Now!!!</div> \n");
      out.write("\n");
      out.write("Be cool and join today.Meet millions \n");
      out.write("<div id=\"tf\">\n");
      out.write("<input type=\"text\" placeholder=\"First name\"/> &nbsp;\n");
      out.write("<input type=\"text\" placeholder=\"Last name\"/><br>\n");
      out.write("<input type=\"email\" placeholder=\"Your Email\"/><br>\n");
      out.write("<input type=\"password\" placeholder=\"Password\"/><br>\n");
      out.write("<legend><b>Date of Birth</b></legend>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <select >\n");
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
      out.write("<select >\n");
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
      out.write(" <select >\n");
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
      out.write("<input type=\"radio\" value=\"m\" name=\"sex\"/>Male\n");
      out.write("<input type=\"radio\" value=\"f\" name=\"sex\"/>Female <br>\n");
      out.write("<input type=\"text\" placeholder=\"Your City\"/>\n");
      out.write("\n");
      out.write("<select width=\"50\">\n");
      out.write("<option value=\"\" disabled selected hidden>country</option> \n");
      out.write("<option value=\"Afghanistan\">Afghanistan</option>\n");
      out.write("    <option value=\"Albania\">Albania</option>\n");
      out.write("    <option value=\"Algeria\">Algeria</option>\n");
      out.write("    <option value=\"American Samoa\">American Samoa</option>\n");
      out.write("    <option value=\"Andorra\">Andorra</option>\n");
      out.write("    <option value=\"Angola\">Angola</option>\n");
      out.write("    <option value=\"Anguilla\">Anguilla</option>\n");
      out.write("    <option value=\"Antartica\">Antarctica</option>\n");
      out.write("    <option value=\"Antigua and Barbuda\">Antigua and Barbuda</option>\n");
      out.write("    <option value=\"Argentina\">Argentina</option>\n");
      out.write("    <option value=\"Armenia\">Armenia</option>\n");
      out.write("    <option value=\"Aruba\">Aruba</option>\n");
      out.write("    <option value=\"Australia\">Australia</option>\n");
      out.write("    <option value=\"Austria\">Austria</option>\n");
      out.write("    <option value=\"Azerbaijan\">Azerbaijan</option>\n");
      out.write("    <option value=\"Bahamas\">Bahamas</option>\n");
      out.write("    <option value=\"Bahrain\">Bahrain</option>\n");
      out.write("    <option value=\"Bangladesh\">Bangladesh</option>\n");
      out.write("    <option value=\"Barbados\">Barbados</option>\n");
      out.write("    <option value=\"Belarus\">Belarus</option>\n");
      out.write("    <option value=\"Belgium\">Belgium</option>\n");
      out.write("    <option value=\"Belize\">Belize</option>\n");
      out.write("    <option value=\"Benin\">Benin</option>\n");
      out.write("    <option value=\"Bermuda\">Bermuda</option>\n");
      out.write("    <option value=\"Bhutan\">Bhutan</option>\n");
      out.write("    <option value=\"Bolivia\">Bolivia</option>\n");
      out.write("    <option value=\"Bosnia and Herzegowina\">Bosnia and Herzegowina</option>\n");
      out.write("    <option value=\"Botswana\">Botswana</option>\n");
      out.write("    <option value=\"Bouvet Island\">Bouvet Island</option>\n");
      out.write("    <option value=\"Brazil\">Brazil</option>\n");
      out.write("    <option value=\"British Indian Ocean Territory\">British Indian Ocean Territory</option>\n");
      out.write("    <option value=\"Brunei Darussalam\">Brunei Darussalam</option>\n");
      out.write("    <option value=\"Bulgaria\">Bulgaria</option>\n");
      out.write("    <option value=\"Burkina Faso\">Burkina Faso</option>\n");
      out.write("    <option value=\"Burundi\">Burundi</option>\n");
      out.write("    <option value=\"Cambodia\">Cambodia</option>\n");
      out.write("    <option value=\"Cameroon\">Cameroon</option>\n");
      out.write("    <option value=\"Canada\">Canada</option>\n");
      out.write("    <option value=\"Cape Verde\">Cape Verde</option>\n");
      out.write("    <option value=\"Cayman Islands\">Cayman Islands</option>\n");
      out.write("    <option value=\"Central African Republic\">Central African Republic</option>\n");
      out.write("    <option value=\"Chad\">Chad</option>\n");
      out.write("    <option value=\"Chile\">Chile</option>\n");
      out.write("    <option value=\"China\">China</option>\n");
      out.write("    <option value=\"Christmas Island\">Christmas Island</option>\n");
      out.write("    <option value=\"Cocos Islands\">Cocos (Keeling) Islands</option>\n");
      out.write("    <option value=\"Colombia\">Colombia</option>\n");
      out.write("    <option value=\"Comoros\">Comoros</option>\n");
      out.write("    <option value=\"Congo\">Congo</option>\n");
      out.write("    <option value=\"Congo\">Congo, the Democratic Republic of the</option>\n");
      out.write("    <option value=\"Cook Islands\">Cook Islands</option>\n");
      out.write("    <option value=\"Costa Rica\">Costa Rica</option>\n");
      out.write("    <option value=\"Cota D'Ivoire\">Cote d'Ivoire</option>\n");
      out.write("    <option value=\"Croatia\">Croatia (Hrvatska)</option>\n");
      out.write("    <option value=\"Cuba\">Cuba</option>\n");
      out.write("    <option value=\"Cyprus\">Cyprus</option>\n");
      out.write("    <option value=\"Czech Republic\">Czech Republic</option>\n");
      out.write("    <option value=\"Denmark\">Denmark</option>\n");
      out.write("    <option value=\"Djibouti\">Djibouti</option>\n");
      out.write("    <option value=\"Dominica\">Dominica</option>\n");
      out.write("    <option value=\"Dominican Republic\">Dominican Republic</option>\n");
      out.write("    <option value=\"East Timor\">East Timor</option>\n");
      out.write("    <option value=\"Ecuador\">Ecuador</option>\n");
      out.write("    <option value=\"Egypt\">Egypt</option>\n");
      out.write("    <option value=\"El Salvador\">El Salvador</option>\n");
      out.write("    <option value=\"Equatorial Guinea\">Equatorial Guinea</option>\n");
      out.write("    <option value=\"Eritrea\">Eritrea</option>\n");
      out.write("    <option value=\"Estonia\">Estonia</option>\n");
      out.write("    <option value=\"Ethiopia\">Ethiopia</option>\n");
      out.write("    <option value=\"Falkland Islands\">Falkland Islands (Malvinas)</option>\n");
      out.write("    <option value=\"Faroe Islands\">Faroe Islands</option>\n");
      out.write("    <option value=\"Fiji\">Fiji</option>\n");
      out.write("    <option value=\"Finland\">Finland</option>\n");
      out.write("    <option value=\"France\">France</option>\n");
      out.write("    <option value=\"France Metropolitan\">France, Metropolitan</option>\n");
      out.write("    <option value=\"French Guiana\">French Guiana</option>\n");
      out.write("    <option value=\"French Polynesia\">French Polynesia</option>\n");
      out.write("    <option value=\"French Southern Territories\">French Southern Territories</option>\n");
      out.write("    <option value=\"Gabon\">Gabon</option>\n");
      out.write("    <option value=\"Gambia\">Gambia</option>\n");
      out.write("    <option value=\"Georgia\">Georgia</option>\n");
      out.write("    <option value=\"Germany\">Germany</option>\n");
      out.write("    <option value=\"Ghana\">Ghana</option>\n");
      out.write("    <option value=\"Gibraltar\">Gibraltar</option>\n");
      out.write("    <option value=\"Greece\">Greece</option>\n");
      out.write("    <option value=\"Greenland\">Greenland</option>\n");
      out.write("    <option value=\"Grenada\">Grenada</option>\n");
      out.write("    <option value=\"Guadeloupe\">Guadeloupe</option>\n");
      out.write("    <option value=\"Guam\">Guam</option>\n");
      out.write("    <option value=\"Guatemala\">Guatemala</option>\n");
      out.write("    <option value=\"Guinea\">Guinea</option>\n");
      out.write("    <option value=\"Guinea-Bissau\">Guinea-Bissau</option>\n");
      out.write("    <option value=\"Guyana\">Guyana</option>\n");
      out.write("    <option value=\"Haiti\">Haiti</option>\n");
      out.write("    <option value=\"Heard and McDonald Islands\">Heard and Mc Donald Islands</option>\n");
      out.write("    <option value=\"Holy See\">Holy See (Vatican City State)</option>\n");
      out.write("    <option value=\"Honduras\">Honduras</option>\n");
      out.write("    <option value=\"Hong Kong\">Hong Kong</option>\n");
      out.write("    <option value=\"Hungary\">Hungary</option>\n");
      out.write("    <option value=\"Iceland\">Iceland</option>\n");
      out.write("    <option value=\"India\">India</option>\n");
      out.write("    <option value=\"Indonesia\">Indonesia</option>\n");
      out.write("    <option value=\"Iran\">Iran (Islamic Republic of)</option>\n");
      out.write("    <option value=\"Iraq\">Iraq</option>\n");
      out.write("    <option value=\"Ireland\">Ireland</option>\n");
      out.write("    <option value=\"Israel\">Israel</option>\n");
      out.write("    <option value=\"Italy\">Italy</option>\n");
      out.write("    <option value=\"Jamaica\">Jamaica</option>\n");
      out.write("    <option value=\"Japan\">Japan</option>\n");
      out.write("    <option value=\"Jordan\">Jordan</option>\n");
      out.write("    <option value=\"Kazakhstan\">Kazakhstan</option>\n");
      out.write("    <option value=\"Kenya\">Kenya</option>\n");
      out.write("    <option value=\"Kiribati\">Kiribati</option>\n");
      out.write("    <option value=\"Democratic People's Republic of Korea\">Korea, Democratic People's Republic of</option>\n");
      out.write("    <option value=\"Korea\">Korea, Republic of</option>\n");
      out.write("    <option value=\"Kuwait\">Kuwait</option>\n");
      out.write("    <option value=\"Kyrgyzstan\">Kyrgyzstan</option>\n");
      out.write("    <option value=\"Lao\">Lao People's Democratic Republic</option>\n");
      out.write("    <option value=\"Latvia\">Latvia</option>\n");
      out.write("    <option value=\"Lebanon\">Lebanon</option>\n");
      out.write("    <option value=\"Lesotho\">Lesotho</option>\n");
      out.write("    <option value=\"Liberia\">Liberia</option>\n");
      out.write("    <option value=\"Libyan Arab Jamahiriya\">Libyan Arab Jamahiriya</option>\n");
      out.write("    <option value=\"Liechtenstein\">Liechtenstein</option>\n");
      out.write("    <option value=\"Lithuania\">Lithuania</option>\n");
      out.write("    <option value=\"Luxembourg\">Luxembourg</option>\n");
      out.write("    <option value=\"Macau\">Macau</option>\n");
      out.write("    <option value=\"Macedonia\">Macedonia, The Former Yugoslav Republic of</option>\n");
      out.write("    <option value=\"Madagascar\">Madagascar</option>\n");
      out.write("    <option value=\"Malawi\">Malawi</option>\n");
      out.write("    <option value=\"Malaysia\">Malaysia</option>\n");
      out.write("    <option value=\"Maldives\">Maldives</option>\n");
      out.write("    <option value=\"Mali\">Mali</option>\n");
      out.write("    <option value=\"Malta\">Malta</option>\n");
      out.write("    <option value=\"Marshall Islands\">Marshall Islands</option>\n");
      out.write("    <option value=\"Martinique\">Martinique</option>\n");
      out.write("    <option value=\"Mauritania\">Mauritania</option>\n");
      out.write("    <option value=\"Mauritius\">Mauritius</option>\n");
      out.write("    <option value=\"Mayotte\">Mayotte</option>\n");
      out.write("    <option value=\"Mexico\">Mexico</option>\n");
      out.write("    <option value=\"Micronesia\">Micronesia, Federated States of</option>\n");
      out.write("    <option value=\"Moldova\">Moldova, Republic of</option>\n");
      out.write("    <option value=\"Monaco\">Monaco</option>\n");
      out.write("    <option value=\"Mongolia\">Mongolia</option>\n");
      out.write("    <option value=\"Montserrat\">Montserrat</option>\n");
      out.write("    <option value=\"Morocco\">Morocco</option>\n");
      out.write("    <option value=\"Mozambique\">Mozambique</option>\n");
      out.write("    <option value=\"Myanmar\">Myanmar</option>\n");
      out.write("    <option value=\"Namibia\">Namibia</option>\n");
      out.write("    <option value=\"Nauru\">Nauru</option>\n");
      out.write("    <option value=\"Nepal\">Nepal</option>\n");
      out.write("    <option value=\"Netherlands\">Netherlands</option>\n");
      out.write("    <option value=\"Netherlands Antilles\">Netherlands Antilles</option>\n");
      out.write("    <option value=\"New Caledonia\">New Caledonia</option>\n");
      out.write("    <option value=\"New Zealand\">New Zealand</option>\n");
      out.write("    <option value=\"Nicaragua\">Nicaragua</option>\n");
      out.write("    <option value=\"Niger\">Niger</option>\n");
      out.write("    <option value=\"Nigeria\">Nigeria</option>\n");
      out.write("    <option value=\"Niue\">Niue</option>\n");
      out.write("    <option value=\"Norfolk Island\">Norfolk Island</option>\n");
      out.write("    <option value=\"Northern Mariana Islands\">Northern Mariana Islands</option>\n");
      out.write("    <option value=\"Norway\">Norway</option>\n");
      out.write("    <option value=\"Oman\">Oman</option>\n");
      out.write("    <option value=\"Pakistan\">Pakistan</option>\n");
      out.write("    <option value=\"Palau\">Palau</option>\n");
      out.write("    <option value=\"Panama\">Panama</option>\n");
      out.write("    <option value=\"Papua New Guinea\">Papua New Guinea</option>\n");
      out.write("    <option value=\"Paraguay\">Paraguay</option>\n");
      out.write("    <option value=\"Peru\">Peru</option>\n");
      out.write("    <option value=\"Philippines\">Philippines</option>\n");
      out.write("    <option value=\"Pitcairn\">Pitcairn</option>\n");
      out.write("    <option value=\"Poland\">Poland</option>\n");
      out.write("    <option value=\"Portugal\">Portugal</option>\n");
      out.write("    <option value=\"Puerto Rico\">Puerto Rico</option>\n");
      out.write("    <option value=\"Qatar\">Qatar</option>\n");
      out.write("    <option value=\"Reunion\">Reunion</option>\n");
      out.write("    <option value=\"Romania\">Romania</option>\n");
      out.write("    <option value=\"Russia\">Russian Federation</option>\n");
      out.write("    <option value=\"Rwanda\">Rwanda</option>\n");
      out.write("    <option value=\"Saint Kitts and Nevis\">Saint Kitts and Nevis</option> \n");
      out.write("    <option value=\"Saint LUCIA\">Saint LUCIA</option>\n");
      out.write("    <option value=\"Saint Vincent\">Saint Vincent and the Grenadines</option>\n");
      out.write("    <option value=\"Samoa\">Samoa</option>\n");
      out.write("    <option value=\"San Marino\">San Marino</option>\n");
      out.write("    <option value=\"Sao Tome and Principe\">Sao Tome and Principe</option> \n");
      out.write("    <option value=\"Saudi Arabia\">Saudi Arabia</option>\n");
      out.write("    <option value=\"Senegal\">Senegal</option>\n");
      out.write("    <option value=\"Seychelles\">Seychelles</option>\n");
      out.write("    <option value=\"Sierra\">Sierra Leone</option>\n");
      out.write("    <option value=\"Singapore\">Singapore</option>\n");
      out.write("    <option value=\"Slovakia\">Slovakia (Slovak Republic)</option>\n");
      out.write("    <option value=\"Slovenia\">Slovenia</option>\n");
      out.write("    <option value=\"Solomon Islands\">Solomon Islands</option>\n");
      out.write("    <option value=\"Somalia\">Somalia</option>\n");
      out.write("    <option value=\"South Africa\">South Africa</option>\n");
      out.write("    <option value=\"South Georgia\">South Georgia and the South Sandwich Islands</option>\n");
      out.write("    <option value=\"Span\">Spain</option>\n");
      out.write("    <option value=\"SriLanka\">Sri Lanka</option>\n");
      out.write("    <option value=\"St. Helena\">St. Helena</option>\n");
      out.write("    <option value=\"St. Pierre and Miguelon\">St. Pierre and Miquelon</option>\n");
      out.write("    <option value=\"Sudan\">Sudan</option>\n");
      out.write("    <option value=\"Suriname\">Suriname</option>\n");
      out.write("    <option value=\"Svalbard\">Svalbard and Jan Mayen Islands</option>\n");
      out.write("    <option value=\"Swaziland\">Swaziland</option>\n");
      out.write("    <option value=\"Sweden\">Sweden</option>\n");
      out.write("    <option value=\"Switzerland\">Switzerland</option>\n");
      out.write("    <option value=\"Syria\">Syrian Arab Republic</option>\n");
      out.write("    <option value=\"Taiwan\">Taiwan, Province of China</option>\n");
      out.write("    <option value=\"Tajikistan\">Tajikistan</option>\n");
      out.write("    <option value=\"Tanzania\">Tanzania, United Republic of</option>\n");
      out.write("    <option value=\"Thailand\">Thailand</option>\n");
      out.write("    <option value=\"Togo\">Togo</option>\n");
      out.write("    <option value=\"Tokelau\">Tokelau</option>\n");
      out.write("    <option value=\"Tonga\">Tonga</option>\n");
      out.write("    <option value=\"Trinidad and Tobago\">Trinidad and Tobago</option>\n");
      out.write("    <option value=\"Tunisia\">Tunisia</option>\n");
      out.write("    <option value=\"Turkey\">Turkey</option>\n");
      out.write("    <option value=\"Turkmenistan\">Turkmenistan</option>\n");
      out.write("    <option value=\"Turks and Caicos\">Turks and Caicos Islands</option>\n");
      out.write("    <option value=\"Tuvalu\">Tuvalu</option>\n");
      out.write("    <option value=\"Uganda\">Uganda</option>\n");
      out.write("    <option value=\"Ukraine\">Ukraine</option>\n");
      out.write("    <option value=\"United Arab Emirates\">United Arab Emirates</option>\n");
      out.write("    <option value=\"United Kingdom\">United Kingdom</option>\n");
      out.write("    <option value=\"United States\">United States</option>\n");
      out.write("    <option value=\"United States Minor Outlying Islands\">United States Minor Outlying Islands</option>\n");
      out.write("    <option value=\"Uruguay\">Uruguay</option>\n");
      out.write("    <option value=\"Uzbekistan\">Uzbekistan</option>\n");
      out.write("    <option value=\"Vanuatu\">Vanuatu</option>\n");
      out.write("    <option value=\"Venezuela\">Venezuela</option>\n");
      out.write("    <option value=\"Vietnam\">Viet Nam</option>\n");
      out.write("    <option value=\"Virgin Islands (British)\">Virgin Islands (British)</option>\n");
      out.write("    <option value=\"Virgin Islands (U.S)\">Virgin Islands (U.S.)</option>\n");
      out.write("    <option value=\"Wallis and Futana Islands\">Wallis and Futuna Islands</option>\n");
      out.write("    <option value=\"Western Sahara\">Western Sahara</option>\n");
      out.write("    <option value=\"Yemen\">Yemen</option>\n");
      out.write("    <option value=\"Yugoslavia\">Yugoslavia</option>\n");
      out.write("    <option value=\"Zambia\">Zambia</option>\n");
      out.write("    <option value=\"Zimbabwe\">Zimbabwe</option>\n");
      out.write("  \n");
      out.write("</select><br>\n");
      out.write("</div>\n");
      out.write("<a href=\"log2.jsp\">Already have an account?</a> <br>\n");
      out.write("<input type=\"submit\" value=\"Register Now\"/>\n");
      out.write("</body>\n");
      out.write("</html></div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
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
