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
		
		<table>
		<tr>
			<th></th>
			<th>Day 1</th>
			<th>Day 2</th>
			<th>Day 3</th>
			<th>Day 4</th>
		</tr>
			<td>Low</td>
			<forEach 
		
		
		</table>
		
		
		
		
		
		<c:url var="parkList" value="/"></c:url>
					<a href="${parkList}">Return to Homepage</a>
	</body>
</html>