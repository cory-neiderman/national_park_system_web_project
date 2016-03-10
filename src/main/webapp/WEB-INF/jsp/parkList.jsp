<!DOCTYPE>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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

		<ul>
			<c:forEach var="park" items="${listOfParks}">
				<li class="park">
					<c:url var="parkImgSrc" value="/img/parks/${park.parkCode}.jpg" />
					<img src="${parkImgSrc}" alt="Picture of <c:out value="${park.name}"/>"/>
					
					<h3>
						<c:url var="parkDetailHref" value="/parkDetail">
							<c:param name="parkCode" value="${park.parkCode}" />
						</c:url>
						<a href="${parkDetailHref}"><c:out value="${park.name}"/></a>
					</h3>
					
					<p><strong>Location: </strong><c:out value="${park.location}"/></p>
					<p><c:out value="${park.description}"/></p>				
					</li>
			</c:forEach>
			
		</ul>
		
	</body>
</html>
		


		