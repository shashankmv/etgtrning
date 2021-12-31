<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple JSP</title>
</head>
<body>
<h1>I am SHASHANK M V.</h1>
<br>
Current time is <%= new java.util.Date() %><br>
Converting to uppercase:<%= new String("hello World").toUpperCase()  %><br>
25 multiplied by 4 equals <%= 25*4 %><br>
Is 75 less than 69:<%= 75<69 %><br>
<%
for(int i=1; i<=5; i++){
	out.println(i);
}
%><br>
<%!
String makeItlower(String data){
	return data.toLowerCase();
}
%>
Lower case "Hello World":<%= makeItlower("Hello World") %>
</body>
</html>