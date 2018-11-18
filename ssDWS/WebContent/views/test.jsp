<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="btn-group">
		<button type="button" class="btn btn-primary dropdown-toggle"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			Action <span class="caret"></span>
		</button>
		<ul class="dropdown-menu">
			<li><a href="#">Action</a></li>
			<li><a href="#">Another action</a></li>
			<li><a href="#">Something else here</a></li>
			<li role="separator" class="divider"></li>
			<li><a href="#">Separated link</a></li>
		</ul>

		<c:out value="This is JSTL" />
		<c:set var="xmltext" value="ZARA" />
		<c:choose>
			<c:when test="${xmltext=='ZARA'}">
            Book is written by ZARA
            <jsp:include page="views/home.jsp" />
			</c:when>

			<c:when test="${xmltext=='NUHA'}">
            Book is written by NUHA
            <jsp:include page="views/contact.jsp" />
			</c:when>

			<c:otherwise>
            Unknown author.
         </c:otherwise>
		</c:choose>
	</div>
</body>
</html>