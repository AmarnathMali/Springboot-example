<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<center>
		<form:form action="process" method="post" modelAttribute="books">
			<form:label path="bookId">Enter a bookId: </form:label>
			<form:input path="bookId" />
			<br>
			<br>
			<form:label path="bookName">Enter a bookName: </form:label>
			<form:input path="bookName" />
			<form:errors path="bookName" cssClass="error"/>
			<br>
			<br>
			<form:label path="authorName">Enter a authorName: </form:label>
			<form:input path="authorName" />
		    <form:errors path="authorName" cssClass="error"/>
			
			<br>
			<br>
			<input type="submit" value="login" />
		</form:form>

	</center>
</body>
</html>