<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" isELIgnored = "false"%>

<html>
	<head>
		<title>My web app</title>
	</head>
	<body>
		
		<form action="search" method="get">
			<label>Enter Name:-</label>
			<input type="text" name="q">
			<input type="submit">
		</form>
		
		
		<hr>
		<h1>${myData}</h1>
		
	</body>
</html>	