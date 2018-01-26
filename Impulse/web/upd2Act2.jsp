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
                  
                  Connection con2= MyCon.getCon();
                  PreparedStatement pst2 =con2.prepareStatement("select * from student where id=?");
                  pst2.setInt(1, Integer.parseInt(request.getParameter("id2")));
                  ResultSet rs2 =pst2.executeQuery();
                  
                 
                   
 while(rs2.next()){
            %>
            <h2 style="margin-left:25%;text-decoration: underline; ">Update Here</h2>
            <form action="upd2Act2" method="post">
                
                <br> Id:<input style="margin-left: 73px;" type="text" value="<%=rs2.getInt(1)%>" name="2id2"   >
                 <br> Roll No:<input style="margin-left: 33px;" type="text" value="<%=rs2.getInt(2)%>" name="2roll2"   >
 <br> Name:<input style="margin-left: 45px;" type="text" value="<%=rs2.getString(3)%>"  name="2name2">
 <br> Email:<input style="margin-left: 44px;" type="email" value="<%=rs2.getString(4)%>"  name="2email2">
 <br> Password:<input  style="margin-left: 10px;" type="text" value="<%=rs2.getString(9)%>" name="2pass2">
 <br> City:<input style="margin-left: 51px;" type="text" value="<%=rs2.getString(7)%>" name="2add2">
 <br> Contact:<input style="margin-left: 26px;" type="text" value="<%=rs2.getString(8)%>" name="2con2">
  <br> Date of Birth:<input style="margin-left: 1px;" type="text" value="<%=rs2.getString(10)%>" name="2dob2">
   <br> Sex:<input style="margin-left: 63px;" type="text" value="<%=rs2.getString(5)%>" name="2sex2">
    <br> Branch:<input style="margin-left: 36px;" type="text" value="<%=rs2.getString(6)%>" name="2branch2">
 <br><input style="margin-top:3%;" type="submit" value="Update"> <br>
  </form>
     
                   <%}}

              catch(Exception e){ 
RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
      out.println("<div style= position:absolute;margin-top:21%;margin-left:37%;color:red;font-weight:700; font-size:1.4em; >!!! please enter valid ID</div>");
  rd.include(request, response);
              System.out.print(e.getMessage());
              } %>
                 
             <div style="margin-top: 40%;"><%@include file="footer.jsp" %>
</div>