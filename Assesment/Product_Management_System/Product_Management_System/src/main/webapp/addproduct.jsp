<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@include file="navbar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<div class="row">

			<div class="col-4 card shadow offset-4 mt-4 ">

				<h1 class="text-center text-success">Product Management</h1>
				<h3 class="text-center text-success">${msg}</h3>
				<form action="addProduct" method="post"
					enctype="multipart/form-data">
					<div class="form-group mt-2">
						<label for="pname">Product Name</label> <input type="text"
							name="pname" id="pname" class="form-control">
					</div>
					<div class="form-group mt-2">
						<label for="category">Product Category</label> <select
							class="form-control" name="category">
							<option value="">-----Select Category------</option>

							<sql:setDataSource driver="com.mysql.cj.jdbc.Driver"
								url="jdbc:mysql://localhost:3306/productmanage" user="root"
								password="kiran@1727" var="data" />

							<sql:query var="sqdt" dataSource="${data}">select * from category</sql:query>

							<c:forEach items="${sqdt.rows}" var="dt">
								<option value="${dt.cname}">${dt.cname}</option>
							</c:forEach>
							
						</select>
					</div>
					<div class="form-group mt-2">
						<label for="model">Product Model</label> <input type="text"
							name="model" id="model" class="form-control">
					</div>
					<div class="form-group mt-2">
						<label for="price">Product Price</label> <input type="text"
							name="price" id="price" class="form-control">
					</div>
					<div class="form-group mt-2">
						<label for="desc">Product Description</label>
						<textarea rows="4" cols="3" class="form-control" name="desc"
							id="desc"></textarea>
					</div>
					<div class="form-group mt-2">
						<label for="image">Product Image</label> <input type="file"
							name="image" id="image" class="form-control">
					</div>


					<div class="d-flex justify-content-center mt-2">
						<input type="submit" class="btn btn-success">
					</div>






				</form>
			</div>

		</div>



	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>