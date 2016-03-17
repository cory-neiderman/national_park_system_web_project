
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<!DOCTYPE>
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
		<h1><c:out value="${parkToShow.parkCode}"/></h1>
		
		
		
		
		<div class="today"> 
		<h2>Today's Weather for <c:out value="${parkToShow.name}"/></h2>
		<p><strong>High:</strong>${forecast.weatherForecast[0].high}</p>
		<p><strong>Low:</strong>${forecast.weatherForecast[0].low}</p>
		<p><strong>Forecast:</strong>${forecast.weatherForecast[0].displayForecast}</p>
		
		<p>
					<c:set var="weatherImageName" value="${forecast.weatherForecast[0].imageName}"/>
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
			
			
			<th>High</th>
			<c:forEach  var="counter" begin="1" end="4">
			<td><c:out value="${forecast.weatherForecast[counter].high}" /></td>
		
		</c:forEach>
		
		
			
		</tr>
		<tr>
			<th>Low</th>
			<c:forEach var="counter" begin="1" end="4">
			<td>${forecast.weatherForecast[counter].low}</td>
		</c:forEach>
		</tr>
		<tr>
			<th>Forecast</th>
			<c:forEach var="counter" begin="1" end="4">
			<td>${forecast.weatherForecast[counter].displayForecast}</td>
		</c:forEach>
		
		</tr>
			<th></th>
			<c:forEach var="counter" begin="1" end="4">
			<c:set var="weatherImageName" value="${forecast.weatherForecast[counter].imageName}"/>
			<c:url var="parkWeatherSrc" value="/img/weather/${weatherImageName}.png" />
			<td class="tablePic"><img src="${parkWeatherSrc}" alt="Picture of <c:out value="${forecast.weatherForecast[counter].forecast}"/>"/></td>
		</c:forEach>
		
		
		</table><br>
		
		
		<c:url  var="formAction" value="/tempScale">
			<c:param name="parkCode" value="${forecast.weatherForecast[0].parkCode}" />
		</c:url>
		<form method="POST" action="${formAction}">
			<label for="tempScale">Choose your temperature scale:</label><br>
		
			Celsius<input type="radio" id="tempScale" name="tempScale" value="celsius"/>
			Fahrenheit<input type="radio" id="tempScale" name="tempScale" value="fahrenheit"/>
			
			<input type="submit" value="Choose"/>
			<p><c:out value="${tempChoice}"/>
		<p class="suggestion"><c:out value="${forecast.weatherForecast[0].dailySuggestion}"/></p>
		</form>
		
		<br>
		<br>
		
		
	<c:choose>
		<c:when test="${parkChoice==null}">
			<c:url  var="surveyAction" value="/survey">
				<c:param name="parkCode" value="${forecast.weatherForecast[0].parkCode}" />
			</c:url>
			<form method = "POST" action = "${surveyAction}">
			<label for="favoriteParkSurvey">Choose your favorite national park!</label><br>
			<ul>
				<c:forEach var="park" items="${listOfParks}">
				 <li><c:out value="${park.name}"/>  <input type="radio" id="favoritePark" name="favoritePark" value="${park.parkCode}"/></li>
							
				</c:forEach>
				</ul>
				<input type="submit" value="Choose"/>
			</form>
		</c:when>
		<c:otherwise>
			
			<table>
				<tr>
			 		<th>Park voted for</th>
			 		<th>Votes</th>
			 	</tr>
			 	<c:forEach items="${allVotes.allVotes}" var="aVote">
			 	<tr>
			 		<td>${aVote.key.park.name}</td>
			 		<td>${aVote.value}</td>
			 	</tr>
			 	</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
			<br>
			
		
		
		<c:out value="${parkChoice}"/>
		<br>
		<c:url var="parkList" value="/"></c:url>
					<a href="${parkList}">Return to Homepage</a>
	</body>
</html>