<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="navbar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Products</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12 card shadow mt-2">

				<h1 class="text-center text-success">All Products</h1>
				<table  class="table table-success table-striped p-5 mt-2">
					<tr>
						<th>Id</th>
						<th>PName</th>
						<th>P_category</th>
						<th>model</th>
						<th>price</th>
						<th>description</th>
						<th>image</th>
						<th colspan="2">Action</th>
					</tr>
					
					<c:forEach items="${list}" var="dt">
						<tr >
							<td>${dt.getPid()}</td>
							<td>${dt.getPname()}</td>
							<td>${dt.getProductCategory()}</td>
							<td>${dt.getModel()}</td>
							<td>${dt.getPrice()}</td>
							<td>${dt.getDescription()}</td>
							<td><img alt="" src="img/${dt.getImage()}" height="50px"
								width="50px"></td>
							<td><a href="findproduct?pid=${dt.getPid()}" class="btn btn-danger">Find</a></td>
							<td><a href="deleteproduct?pid=${dt.getPid()}" class="btn btn-info">Delete</a></td>
						</tr>
					</c:forEach>




				</table>

			</div>



		</div>
	</div>
</body>
</html>