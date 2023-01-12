
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Add Product</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
  <spring:url value="/product/addProduct" var="addURL" />
  <h2>Add Product</h2>
  <form:form modelAttribute="productForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="pid"/>
   
   <div class="form-group">
    <label>Product Name</label>
    <form:input path="pname" cssClass="form-control" id="pname" />
   </div>
   
   <div class="form-group">
    <label>Price</label>
    <form:input path="price" cssClass="form-control" id="price" />
   </div>
   <button type="submit" class="btn btn-success">Add Product</button>
  </form:form>
  
 </div>
	
</body>
</html>