<!DOCTYPE>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<html>

	<head>
		<title>National Park Geek</title>
		<c:url var="cssHref" value="/css/site.css" />
		<link type="text/css" rel="stylesheet" href="${cssHref}"/>
	</head>
	<body>
		<header>
			<c:url var="logoSrc" value="/img/logo.png" />			
			<img id="logo" src="${logoSrc}" alt="National Park Geek Logo"/>
		</header>
		
		<h1><c:out value="${parkToShow.name}"/></h1>
		
		
		
		
		<div class="today"> 
		<p>${today.high}</p>
		<p>${today.low}</p>
		<p>${today.forecast}</p>
		</div>
		
		
		<table>
		<tr>
			<th></th>
			<th>Day 1</th>
			<th>Day 2</th>
			<th>Day 3</th>
			<th>Day 4</th>
		</tr>
		<tr>
			<td>Low</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>High</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>Forecast</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		</table><br>
		
		
		
		
		
		<c:url var="parkList" value="/"></c:url>
					<a href="${parkList}">Return to Homepage</a>
	</body>
</html>