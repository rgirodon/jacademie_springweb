<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="java.util.Date"%>

<%
Date date = new Date();
%>

<html>
<body>
<h2>Hello World!</h2>
<h3>Nous sommes le <%= date.toString() %></h3>
<h3>Livre : <c:out value="${ book.title }" ></c:out> par <c:out value="${ book.author }" ></c:out></h3>
</body>
</html>
