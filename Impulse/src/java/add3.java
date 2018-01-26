

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Riyazuddin khan
 */
@WebServlet(urlPatterns = {"/add3"})
public class add3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter(); 
        try{ Connection con=MyCon.getCon();
  PreparedStatement pst= con.prepareStatement("insert into expert(name,email,sex,designation,city,contact,password,DOB) values(?,?,?,?,?,?,?,?)");
 
  String fname=request.getParameter("fn");
  String lname=request.getParameter("ln");
  String name=fname+lname;
  String email=request.getParameter("mail");
  String sex=request.getParameter("sex");
 
  String d=request.getParameter("d");
  String m=request.getParameter("m");
  String y=request.getParameter("y");
  String date=d.concat("/")+m.concat("/")+y;
  String pass=request.getParameter("pass");
  String contact=request.getParameter("contact");
  String city=request.getParameter("city");
  String designation=request.getParameter("designation");
  
  
  
  pst.setString(1,name);
  pst.setString(2,email);
  pst.setString(3,sex);
  pst.setString(4, designation);

  pst.setString(5, city);
  pst.setString(6, contact);
  pst.setString(7, pass);
  pst.setString(8, date);
  
  int i=pst.executeUpdate();
          RequestDispatcher rd=request.getRequestDispatcher("login3.jsp");
  if(i>0){
      

  rd.forward(request, response);
  }
  else {  out.println("<div id=res2 >!!! Please Try Again</div>");
  rd.include(request, response);
  }}
  catch(Exception e){    RequestDispatcher rd=request.getRequestDispatcher("login3.jsp");
    out.println("<div id=res2>!!! Please Try Again</div>");
  rd.include(request, response);
  System.out.println("some exception is come in adding record :"+e.getMessage());
  }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
