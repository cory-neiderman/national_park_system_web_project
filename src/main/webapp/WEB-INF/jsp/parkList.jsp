<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!--<c:import url="header.jsp"></c:import>-->
<c:url var="imageRoot" value = "/img"/>
<c:url var="cssRoot" value="/css"/>
<!DOCTYPE>
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
			<li class="park">
				<img src="${imageRoot}/parks/gnp.jpg" alt="Picture of Glacier National Park"/>
				<h3>Glacier National Park</h3>
				<p><strong>Location:</strong>Montana</p>
				<p>Lorem ipsum dolor sit amet, amet wisi arcu suspendisse, dolor risus est sodales sociis arcu vel, orci sed magna adipiscing massa interdum. Fermentum rutrum nullam hac, nam sodales eleifend pede a, vel ridiculus cursus varius faucibus in in, dapibus integer nobis sem. Mauris ullamcorper, dolor ipsum donec. Ullamcorper iaculis feugiat ut, massa nibh id sodales in, quisque tristique porttitor fermentum pellentesque nunc, dicta cursus aenean, orci ac. Pede at integer odio, ut vel massa duis dolor ut ante, vitae mauris ligula consequat diam, cras at. Molestie ac, nibh rutrum commodo non in, nonummy cras imperdiet, nulla et vitae, urna vitae nunc sed quisque eget suspendisse. Vel in tellus in nullam nam vitae.</p>
			</li>
			<li class="park">
				<img src="${imageRoot}/parks/ynp.jpg" alt="Picture of Yellowstone National Park"/>
				<h3>Yellowstone National Park</h3>
				<p><strong>Location:</strong>Wyoming</p>
				<p>Lorem ipsum dolor sit amet, amet wisi arcu suspendisse, dolor risus est sodales sociis arcu vel, orci sed magna adipiscing massa interdum. Fermentum rutrum nullam hac, nam sodales eleifend pede a, vel ridiculus cursus varius faucibus in in, dapibus integer nobis sem. Mauris ullamcorper, dolor ipsum donec. Ullamcorper iaculis feugiat ut, massa nibh id sodales in, quisque tristique porttitor fermentum pellentesque nunc, dicta cursus aenean, orci ac. Pede at integer odio, ut vel massa duis dolor ut ante, vitae mauris ligula consequat diam, cras at. Molestie ac, nibh rutrum commodo non in, nonummy cras imperdiet, nulla et vitae, urna vitae nunc sed quisque eget suspendisse. Vel in tellus in nullam nam vitae.</p>
			</li>
			<li class="park">
				<img src="${imageRoot}/parks/cvnp.jpg" alt="Picture of Cuyahoga Valley National Park"/>
				<h3>Glacier National Park</h3>
				<p><strong>Location:</strong>Ohio</p>
				<p>Lorem ipsum dolor sit amet, amet wisi arcu suspendisse, dolor risus est sodales sociis arcu vel, orci sed magna adipiscing massa interdum. Fermentum rutrum nullam hac, nam sodales eleifend pede a, vel ridiculus cursus varius faucibus in in, dapibus integer nobis sem. Mauris ullamcorper, dolor ipsum donec. Ullamcorper iaculis feugiat ut, massa nibh id sodales in, quisque tristique porttitor fermentum pellentesque nunc, dicta cursus aenean, orci ac. Pede at integer odio, ut vel massa duis dolor ut ante, vitae mauris ligula consequat diam, cras at. Molestie ac, nibh rutrum commodo non in, nonummy cras imperdiet, nulla et vitae, urna vitae nunc sed quisque eget suspendisse. Vel in tellus in nullam nam vitae.</p>
			</li>
		
		
		</ul>

<c:import url="footer.jsp"></c:import>
		