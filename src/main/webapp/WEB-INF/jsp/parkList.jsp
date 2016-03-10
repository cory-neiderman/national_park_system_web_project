<!DOCTYPE>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url var="imageRoot" value = "/img"/>
<c:url var="cssRoot" value="/css"/>


<html>

	<head>
		<title>National Park Geek</title>
		<link type="text/css" rel="stylesheet" href="${cssRoot}/site.css"/>
	</head>
	<body>
		<header>
			<img id="logo" src="${imageRoot}/logo.png" alt="National Park Geek Logo"/>
		</header>

		<ul>
			<c:forEach var="park" items="${listOfParks}">
				<li class="park">
					<img src="${imageRoot}/parks/${park.parkCode}.jpg" alt="Picture of <c:out value="${park.name}"/>"/>
					
					<h3><c:out value="${park.name}"/></h3>
					
					<p><strong>Location: </strong><c:out value="${park.location}"/></p>
					<p><c:out value="${park.description}"/></p>				
					</li>
			</c:forEach>
			
		</ul>
		
	</body>
</html>
		


		