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
		
					<p>
					<c:url var="parkImgSrc" value="/img/parks/${parkToShow.parkCode}.jpg" />
					<img src="${parkImgSrc}" alt="Picture of <c:out value="${parkToShow.name}"/>"/>
					</p>
					
					
					
					
					<p><strong>Location: </strong><c:out value="${parkToShow.location}"/></p>
					<p><c:out value="${parkToShow.description}"/></p>				
		
		
		
		
		
		
		
		
		
		
		
					<c:url var="parkList" value="/"></c:url>
					<a href="${parkList}">Return to Homepage</a>
					
		
		
	</body>
</html>
	