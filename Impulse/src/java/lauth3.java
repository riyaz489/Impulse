/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
import javax.servlet.http.HttpSession;


@WebServlet(name = "lauth3", urlPatterns = {"/lauth3"})
public class lauth3 extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                 Connection con=MyCon.getCon();
        PreparedStatement pst=con.prepareStatement("select * from expert where email=? and password=?");
        pst.setString(1, request.getParameter("m3"));
        pst.setString(2,request.getParameter("p3"));
        ResultSet rs=null;
     rs=pst.executeQuery();
        if(rs.next()){
        HttpSession hs=request.getSession();
        hs.setAttribute("exn",request.getParameter("m3"));
        hs.setAttribute("exp",request.getParameter("p3"));
        
        RequestDispatcher rd=request.getRequestDispatcher("expert.jsp");
                               rd.forward(request,response);
        }
        
           else
            {
                RequestDispatcher rd=request.getRequestDispatcher("login3.jsp");
                out.println("<font color=red>LOGIN FAILED.....!!!!</font>");
                rd.include(request, response);
            }
        }
        catch(Exception e){
        System.out.println("kuch to gadbad hai"+e.getMessage());}
        
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
