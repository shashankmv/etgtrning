<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>insert</title>
</head>
<body>
<h1> This is JSTL example</h1>
<c:set var="i" value="23" scope="application"></c:set>
<h1> <c:out value="${i}"></c:out> </h1>
</body>
</html>