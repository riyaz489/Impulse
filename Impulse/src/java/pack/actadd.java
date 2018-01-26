
package pack;

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
@WebServlet(name = "actadd", urlPatterns = {"/actadd"})
public class actadd extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("<link rel=stylesheet type=text/css href=css.css></link> ");
        try (PrintWriter out = response.getWriter()) {
          try{ Connection con=MyCon.getCon();
  PreparedStatement pst= con.prepareStatement("insert into admin values(?,?,?,?,?,?,?,?)");
  
  String name=request.getParameter("name");
  String email=request.getParameter("email");
  String pass=request.getParameter("pass");
  String add=request.getParameter("add");
    String dob=request.getParameter("dob");
      String branch=request.getParameter("branch");
        String sex=request.getParameter("sex");
  String contact=request.getParameter("con");
  
  

  pst.setString(1,name);
  pst.setString(2,email);
  pst.setString(6,pass);
  pst.setString(3,branch);
  pst.setString(4,add);
  pst.setString(7,dob);
  pst.setString(8,sex);
  pst.setString(5, contact);
  int i=pst.executeUpdate();
          RequestDispatcher rd=request.getRequestDispatcher("addact.jsp");
  if(i>0){
      
  out.println("<div id=res >Data inserted....</div>");
  rd.include(request, response);
  }
  else {  out.println("<div id=res2 >!!! Data not inserted</div>");
  rd.forward(request, response);
  }}
  catch(Exception e){    RequestDispatcher rd=request.getRequestDispatcher("addact.jsp");
    out.println("<div id=res2>!!! Data not inserted</div>");
  rd.include(request, response);
  System.out.println("some exception is come in adding record :"+e.getMessage());
  }
  
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
