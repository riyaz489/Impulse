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
import java.sql.ResultSet;
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
@WebServlet(name = "upd3Act", urlPatterns = {"/upd3Act"})
public class upd3Act extends HttpServlet {

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
      try  {   Connection con=MyCon.getCon();
        PreparedStatement pst=con.prepareStatement("select * from expert where id= ? ");
       int id=Integer.parseInt(request.getParameter("id3"));
        pst.setInt(1,id);
        ResultSet rs =pst.executeQuery();
  
        if(rs.next()){
        RequestDispatcher rd=request.getRequestDispatcher("upd3Act2.jsp");
               rd.forward(request,response); 
        }
        
           else
            {
                RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
                out.println("<font  style= position:absolute;margin-top:110%;margin-left:37%;color:red;font-weight:700; font-size:1.4em;>Please enter valid ID.....!!!!</font>");
                rd.include(request, response);
            }
        }
        catch(Exception e){
             RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
                out.println("<font  style= position:absolute;margin-top:110%;margin-left:37%;color:red;font-weight:700; font-size:1.4em;>Please enter valid ID.....!!!!</font>");
                rd.include(request, response);
        System.out.println("some exception"+e.getMessage());}
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
