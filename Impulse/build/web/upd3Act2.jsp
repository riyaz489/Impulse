<%-- 
    Document   : updAct2
    Created on : Jul 20, 2017, 7:40:37 PM
    Author     : Riyazuddin khan
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.ResultSetRow"%>
<%@page import="pack.MyCon"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@include file="aheader.jsp" %>
<head><link rel="stylesheet" type="text/css" href="css.css"></head>

<%HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
          %>  <%
                       try{ 
                  
                  Connection con3= MyCon.getCon();
                  PreparedStatement pst3 =con3.prepareStatement("select * from expert where id=?");
                  pst3.setInt(1, Integer.parseInt(request.getParameter("id3")));
                  ResultSet rs3 =pst3.executeQuery();
                    
              

 while(rs3.next()){
            %>
            <h2 style="margin-left:25%;text-decoration: underline; ">Update Here</h2>
            <form action="upd3Act2" method="post">
                
                <br> Id:<input style="margin-left: 73px;" type="text" value="<%=rs3.getInt(1)%>" name="3id2"   >
 <br> Name:<input style="margin-left: 45px;" type="text" value="<%=rs3.getString(2)%>"  name="3name2">
 <br> Email:<input style="margin-left: 44px;" type="email" value="<%=rs3.getString(3)%>"  name="3email2">
 <br> Password:<input  style="margin-left: 12px;" type="text" value="<%=rs3.getString(8)%>" name="3pass2">
 <br> City:<input style="margin-left: 57px;" type="text" value="<%=rs3.getString(6)%>" name="3add2">
 <br> Contact:<input style="margin-left: 29px;" type="text" value="<%=rs3.getString(7)%>" name="3con2">
  <br> Date of Birth:<input style="margin-left: 1px;" type="text" value="<%=rs3.getString(9)%>" name="3dob2">
   <br> Sex:<input style="margin-left: 70px;" type="text" value="<%=rs3.getString(4)%>" name="3sex2">
    <br> Designation:<input style="margin-left: 3px;" type="text" value="<%=rs3.getString(5)%>" name="3branch2">
 <br><input style="margin-top:3%;" type="submit" value="Update"> <br>
  </form>
     
                   <%}



}

              catch(Exception e){ 
RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
      out.println("<div style= position:absolute;margin-top:21%;margin-left:37%;color:red;font-weight:700; font-size:1.4em; >!!! please enter valid ID</div>");
  rd.include(request, response);
              System.out.print(e.getMessage());
              } %>
                 
             <div style="margin-top: 40%;"><%@include file="footer.jsp" %>
</div>