
function myFunction() {
var phoneNum = /^\d{10}$/; 
var password =/^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\d]){1,})(?=(.*[\W]){1,})(?!.*\s).{8,}$/;       //min 8length,one number, one upper case, one lower case, one special char
var fn = document.getElementById("fn").value;
var ln = document.getElementById("ln").value;
var date = document.getElementById("d").value;
var month = document.getElementById("m").value;
var year = document.getElementById("y").value;
var sex = document.getElementById("sex").value;
var city = document.getElementById("city").value;
var branch = document.getElementById("designation").value;
var phone = document.getElementById("contact").value;
var pass = document.getElementById("pass").value;
if(fn=="")
alert("First Name is empty");
if(ln=="")
alert("Last Name is empty");
if(date=="-")
alert("Date is empty");
if(month=="-")
alert("Month is empty");
if(year=="-")
alert("Year is empty");
if(sex=="")
alert("Sex feild is empty");
if(branch=="")
alert("Designation feild is empty");
if(city=="")
alert("City feild is empty");

if(!phone.match(phoneNum))
alert("phone number not valid");

if(!pass.match(password))
alert("password not valid\n(please make a combination of one uppercase,one lowecase,one number and one special character)");

}
