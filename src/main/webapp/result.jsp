<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>


   <c:forEach var="s" items="${styles}">
    ${s}
</c:forEach>


</body>
</html>