
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
  <h1>Add Admin</h1>  
<form action="actadd" method="post">

 <br> Name:<input style="margin-left: 48px;" type="text" placeholder="enter your name" name="name">
 <br> Email:<input style="margin-left: 46px;" type="email" placeholder="enter your email" name="email">
 <br> Password:<input  type="password" placeholder="enter your password" name="pass">
  <br> DOB:<input style="margin-left: 55px;" type="text" placeholder="enter your DOB" name="dob">
   <br> Branch:<input style="margin-left: 37px;" type="text" placeholder="enter your branch" name="branch">
 <br> City:<input style="margin-left: 64px;" type="text" placeholder="enter your city" name="add">
  <br> Sex:<input style="margin-left: 68px;" type="text" placeholder="enter your sex" name="sex">
 <br> Contact:<input style="margin-left: 32px;" type="text" placeholder="enter your contact" name="con">
 <br><input type="submit" value="submit"> <br>
  </form>
</body><div style="margin-top: 20%;"><%@include file="footer.jsp" %>