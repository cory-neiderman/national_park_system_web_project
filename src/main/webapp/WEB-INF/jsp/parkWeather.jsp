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
		<h2>Today's Weather</h2>
		<p><strong>High:</strong>${today.high}</p>
		<p><strong>Low:</strong>${today.low}</p>
		<p><strong>Forecast:</strong>${today.forecast}</p>
		
		<p>
					<c:set var="weatherImageName" value="${today.forecast}"/>
					<c:url var="parkWeatherSrc" value="/img/weather/${weatherImageName}.png" />
					<img src="${parkWeatherSrc}" alt="Picture of <c:out value="${today.forecast}"/>"/>
	
					</p>
		</div>
		
		
		<table class="weatherDisplay">
		<tr>
			<th></th>
			<th>Day 1</th>
			<th>Day 2</th>
			<th>Day 3</th>
			<th>Day 4</th>
		</tr>
		<tr>
			
			
			<th>Low</th>
			<c:forEach var="counter" begin="1" end="4">
			<td>${weatherList[counter].low}</td>
		</c:forEach>
		
		
			
		</tr>
		<tr>
			<th>High</th>
			<c:forEach var="counter" begin="1" end="4">
			<td>${weatherList[counter].high}</td>
		</c:forEach>
		</tr>
		<tr>
			<th>Forecast</th>
			<c:forEach var="counter" begin="1" end="4">
			<td>${weatherList[counter].forecast}</td>
		</c:forEach>
		</tr>
		</table><br>
		
		
		
		
		
		<c:url var="parkList" value="/"></c:url>
					<a href="${parkList}">Return to Homepage</a>
	</body>
</html>