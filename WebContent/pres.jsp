<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script 
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
		</script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
		</script>
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
			integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
			crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="presidentPretty.css">
		<title>US Presidents</title>
	</head>
	<body>
	
		<div class="parallax">
			<!-- Image of WH goes here and title will scroll over it. -->
		</div>
	
		<!--  input form box -->
		<form action="selectPresident.do" method="post">
			<input type="number" name="term" min="1" max="45" step="1" value="${president.termNumber}"> 
			<input type="submit" value="submit">
		</form>
		
		<%-- <c:if test="${value}"> --%>
		Term: ${president.termNumber} Name: ${president.firstName}
		${president.middleName} ${president.lastName}
		<br> 
		Term Start: ${president.termStart} Term End:
		${president.termEnd} Number of Elections Won: ${president.electionsWon}
		Reasons Left Office: ${president.whyLeftOffice} Political Party:
		${president.party} Interesting Fact: ${president.funFact}
		<br>
		<img src="${president.imageLocation}" />
		<%-- </c:if> --%>
	
		<form action="button.do" method="post">
			<c:choose>
			<c:when test="${president.termNumber == 45}">
			<button class=button name="term" value="${president.termNumber - 44}">next</button>
			</c:when>
			<c:otherwise>
			<button class=button name="term" value="${president.termNumber + 1}">next</button>
			</c:otherwise>
			</c:choose>
		</form>
	
		<form action="button.do" method="post">
			<c:choose>
			<c:when test="${president.termNumber == 1}">
			<button class=button name="term" value="${president.termNumber + 44}">previous</button>
			</c:when>
			<c:otherwise>
			<button class=button name="term" value="${president.termNumber - 1}">previous</button>
			</c:otherwise>
			</c:choose>
		</form>
	
	</body>
</html>