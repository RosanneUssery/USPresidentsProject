<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>US Presidents</title>
</head>
<body>

<!-- form action="selectPres.do" method="get">
<select name="term" type="number">  -->

<form action="selectPresident.do" method="post">
		<input type="text" name="term"> 
	
		<input type="submit" value="submit">
	</form>
Term: ${president.termNumber}
Name: ${president.firstName}
${president.middleName}
${president.lastName}
<!-- </select>
</form> -->


</body>
</html>