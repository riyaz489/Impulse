


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="pack.MyCon"%>

<%@include file="aheader.jsp" %>
<%HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
            %>
<head>
    <title>Admin Panel</title>
    <link rel="stylesheet" type="text/css" href="css.css">
</head>
<body>
  <h1> Admin Details</h1>  

<center><table border="1" style="height:30%;width:70%;background-color: #333333;color:white;">
    <thead>
        <tr>
            <th>USER ID</th>
            <th>NAME</th>
            <th>EMAIL ADDRESS</th>
            <th>BRANCH</th>
            <th>CITY</th>
            <th>CONTACT</th>
             <th>PASSWORD</th>
              <th>DOB</th>
               <th>SEX</th>
             <th>DELETE</th>
             

</tr>
    </thead><tbody>
    <%  try{
        Connection con = MyCon.getCon();
        PreparedStatement pst=con.prepareStatement("select * from admin");
        ResultSet rs=pst.executeQuery();
        while(rs.next()){ %>
    <form action="delAct" method="post">
        <tr>
            <td><%=rs.getInt(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getString(6)%></td>
            <td><%=rs.getString(7)%></td>
            <td><%=rs.getString(8)%></td>
            <td><%=rs.getString(9)%></td>
            <td><input type="hidden" value="<%=rs.getInt(1)%>" name="id"><input style="margin:0px; width:100%;padding:0px;border-radius: 0em; color:red;" type="SUBMIT" value="DELETE"></td>
        </tr>
        </form>
   <%     }


    }
    catch(Exception e)
    {
    }
    %>
    
    
    </tbody>
</table>
  
    </center><br>
<h1> Student Details</h1>  

<center><table border="1" style="height:30%;width:70%;background-color: #333333;color:white;">
    <thead>
        <tr>
            <th>USER ID</th>
            <th>Roll No.</th>
            <th>NAME</th>
            <th>EMAIL ADDRESS</th>
            <th>SEX</th>
            <th>BRANCH</th>
            <th>CITY</th>
            <th>CONTACT</th>
             <th>PASSWORD</th>
              <th>DOB</th>
               
             <th>DELETE</th>
             

</tr>
    </thead><tbody>
    <%  try{
        Connection con2 = MyCon.getCon();
        PreparedStatement pst2=con2.prepareStatement("select * from Student");
        ResultSet rs2=pst2.executeQuery();
        while(rs2.next()){ %>
    <form action="delAct2" method="post">
        <tr>
            <td><%=rs2.getInt(1)%></td>
            <td><%=rs2.getInt(2)%></td>
            <td><%=rs2.getString(3)%></td>
            <td><%=rs2.getString(4)%></td>
            <td><%=rs2.getString(5)%></td>
            <td><%=rs2.getString(6)%></td>
            <td><%=rs2.getString(7)%></td>
            <td><%=rs2.getString(8)%></td>
            <td><%=rs2.getString(9)%></td>
            <td><%=rs2.getString(10)%></td>
            <td><input type="hidden" value="<%=rs2.getInt(1)%>" name="id2"><input style="margin:0px; width:100%;padding:0px;border-radius: 0em; color:red;" type="SUBMIT" value="DELETE"></td>
        </tr>
        </form>
   <%     }


    }
    catch(Exception e)
    {
    }
    %>
    
    
    </tbody>
</table>
  
    </center>
    
    <br>
<h1> Expert Details</h1>  

<center><table border="1" style="height:30%;width:70%;background-color: #333333;color:white;">
    <thead>
        <tr>
            <th>USER ID</th>
          
            <th>NAME</th>
            <th>EMAIL ADDRESS</th>
            <th>SEX</th>
            <th>DESIGNATION</th>
            <th>CITY</th>
            <th>CONTACT</th>
             <th>PASSWORD</th>
              <th>DOB</th>
               
             <th>DELETE</th>
             

</tr>
    </thead><tbody>
    <%  try{
        Connection con3 = MyCon.getCon();
        PreparedStatement pst3=con3.prepareStatement("select * from EXPERT");
        ResultSet rs3=pst3.executeQuery();
        while(rs3.next()){ %>
    <form action="delAct3" method="post">
        <tr>
            <td><%=rs3.getInt(1)%></td>
        
            <td><%=rs3.getString(2)%></td>
            <td><%=rs3.getString(3)%></td>
            <td><%=rs3.getString(4)%></td>
            <td><%=rs3.getString(5)%></td>
            <td><%=rs3.getString(6)%></td>
            <td><%=rs3.getString(7)%></td>
            <td><%=rs3.getString(8)%></td>
            <td><%=rs3.getString(9)%></td>
            <td><input type="hidden" value="<%=rs3.getInt(1)%>" name="id3"><input style="margin:0px; width:100%;padding:0px;border-radius: 0em; color:red;" type="SUBMIT" value="DELETE"></td>
        </tr>
        </form>
   <%     }


    }
    catch(Exception e)
    {
    }
    %>
    
    
    </tbody>
</table>
  
    </center>
  
  
  
  
</body><div style="margin-top: 20%;"><%@include file="footer.jsp" %>