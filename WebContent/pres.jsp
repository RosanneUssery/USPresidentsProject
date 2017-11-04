<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="presidentPretty.css">
<title>US Presidents</title>
</head>
<body>

<div class="parallax">
	<!-- Image of WH goes here and title will scroll over it. -->
	
</div>

	<form action="selectPresident.do" method="post">
		<input type="text" name="term"> 
		<input type="submit" value="submit">
	</form>
	
<%-- <c:if test="${not empty pres }"> --%>
Term: ${president.termNumber}
Name: ${president.firstName}
${president.middleName}
${president.lastName} <br>
Term Start: ${president.termStart}
Term End: ${president.termEnd}
Number of Elections Won: ${president.electionsWon}
Reasons Left Office: ${president.whyLeftOffice}
Political Party: ${president.party}
Interesting Fact: ${president.funFact} <br>
<img src="${president.imageLocation}"/>
<%-- </c:if> --%>

</body>
</html>