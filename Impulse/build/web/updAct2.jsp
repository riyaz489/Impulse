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
                       try{ Connection con1= MyCon.getCon();
                  PreparedStatement pst =con1.prepareStatement("select * from admin where id=?");
                  pst.setInt(1, Integer.parseInt(request.getParameter("id")));
                  ResultSet rs =pst.executeQuery();
                  
                  
                  
                    while(rs.next()){
            %>
            <h2 style="margin-left:25%;text-decoration: underline; ">Update Here</h2>
            <form action="updAct2" method="post">
                
                <br> Id:<input style="margin-left: 77px;" type="text" value="<%=rs.getInt(1)%>" name="id2"   >
 <br> Name:<input style="margin-left: 50px;" type="text" value="<%=rs.getString(2)%>"  name="name2">
 <br> Email:<input style="margin-left: 49px;" type="email" value="<%=rs.getString(3)%>"  name="email2">
 <br> Password:<input  type="text" style="margin-left: 17px;"value="<%=rs.getString(7)%>" name="pass2">
 <br> City:<input style="margin-left: 63px;" type="text" value="<%=rs.getString(5)%>" name="add2">
 <br> Contact:<input style="margin-left: 36px;" type="text" value="<%=rs.getString(6)%>" name="con2">
  <br> Date of Birth:<input style="margin-left: 6px;" type="text" value="<%=rs.getString(8)%>" name="dob2">
   <br> Sex:<input style="margin-left: 75px;" type="text" value="<%=rs.getString(9)%>" name="sex2">
    <br> Branch:<input style="margin-left: 44px;" type="text" value="<%=rs.getString(4)%>" name="branch2">
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