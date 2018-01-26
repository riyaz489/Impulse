/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "upd2Act2", urlPatterns = {"/upd2Act2"})
public class upd2Act2 extends HttpServlet {

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
        try  {
          Connection con=MyCon.getCon();
            PreparedStatement pst = con.prepareStatement("update student set roll=?, name=?,email=?,password=?,branch=?,city=?,contact=?,DOB=?,sex=? where id=?");
             int id=Integer.parseInt(request.getParameter("2id2"));
             pst.setInt(10, id);
             int roll=Integer.parseInt(request.getParameter("2roll2"));
             pst.setInt(1, roll);
                pst.setString(2, request.getParameter("2name2"));
                 pst.setString(3, request.getParameter("2email2"));
                  pst.setString(4, request.getParameter("2pass2"));
                   pst.setString(6, request.getParameter("2add2"));
                    pst.setString(7, request.getParameter("2con2"));
                     pst.setString(8, request.getParameter("2dob2"));
                      pst.setString(9, request.getParameter("2sex2"));
                       pst.setString(5, request.getParameter("2branch2"));
                     
                     
                     int i=pst.executeUpdate();
        
  if(i>0){
         RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
  out.println("<div  style= position:absolute;margin-top:65%;margin-left:37%;color:green;font-weight:700; font-size:1.4em; >Data updated....</div>");
  rd.include(request, response);
  }
  else {  RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
      out.println("<div style= position:absolute;margin-top:65%;margin-left:37%;color:red;font-weight:700; font-size:1.4em; >!!! Data not updated</div>");
  rd.include(request, response);
  }
        }
        catch(Exception e){ RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
               out.println("<div style=position:absolute;margin-top:65%;margin-left:37%;color:red;font-weight:700; font-size:1.4em;>!!! Data not updated</div>");
                rd.include(request, response);
                System.out.println(e.getMessage());
           
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
