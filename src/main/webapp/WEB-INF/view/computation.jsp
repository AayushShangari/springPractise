<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/springPractise/formSubmit.html" method="post">
<p>Name: <input type = "text" name = "name" /> </p> 
<p>Age:  <input type = "text" name = "age"/></p>
<p>DOB:  <input type = "text" name = "dob"/></p>
<p>phone:  <input type = "text" name = "phone"/></p>
<p>Skills:  <select name = "skilss">
			<option value="java">java</option>
			<option value="python">python</option>
			<option value="node">node</option>
			<option value="react">react</option>
			</select></p>

<input type="submit" value="Click here!">



</form>


</body>
