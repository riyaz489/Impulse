<%@include file="aheader.jsp" %>
<%HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
            %>
            <head><style> body{
            background-color: #FFF !IMPORTANT;
            background-size: 100%50.4%;
         }
         input[type="submit"]{
             color: whitesmoke;
             background-color: #222222;
             padding:4px;
             font-weight: 700;
             height: 30px;
             width: 90px;
             margin-top:7%;
             margin-left:25%;
             border-radius: 2em;
             border-width: 0px;
             margin-bottom: 14%;
             
             
         }</style></head>
           <body ><form action="srch" method="post">
                   <h1 style="margin-left:20%;margin-top:1%;margin-bottom: 7%;"> Find Other Admins</h1>
           
           <u style="font-weight: 600;font-size: 1.2em;margin-left: 25%;">Enter ID : </u>
           <input style="margin-left: 3%;height:25px; " type="text" placeholder="enter  ID number" name="id">
           <br><input type="submit" value="Search"></form>
               
               <form action="srch2" method="post">
                   <h1 style="margin-left:20%;margin-top:1%;margin-bottom: 7%;"> Find Other Students</h1>
           
           <u style="font-weight: 600;font-size: 1.2em;margin-left: 25%;">Enter ID : </u>
           <input style="margin-left: 3%;height:25px; " type="text" placeholder="enter  ID number" name="id2">
           <br><input type="submit" value="Search"></form>
               
               <form action="srch3" method="post">
                   <h1 style="margin-left:20%;margin-top:1%;margin-bottom: 7%;"> Find Other Experts</h1>
           
           <u style="font-weight: 600;font-size: 1.2em;margin-left: 25%;">Enter ID : </u>
           <input style="margin-left: 3%;height:25px; " type="text" placeholder="enter  ID number" name="id3">
           <br><input type="submit" value="Search"></form>
           </body>
           <div style="margin-top: 20%;"><%@include file="footer.jsp" %>
</div>