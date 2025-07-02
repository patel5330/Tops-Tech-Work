<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@include file="navbar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category</title>

<!-- Bootstrap CSS CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	background-color: #f8f9fa;
}

.form-container {
	max-width: 500px;
	margin: 60px auto;
	padding: 30px;
	background-color: #ffffff;
	border-radius: 15px;
	box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
}

.form-title {
	text-align: center;
	margin-bottom: 25px;
	color: #343a40;
}
</style>
</head>
<body>

	<div class="container">
		<div class="form-container">
			<h2 class="form-title">Add Category</h2>
			<h3 class="text-center text-primaey">${msg}</h3>
			<form action="updatecategory" method="post">
				<div class="mb-3">
					<label for="categoryId" class="form-label">Category ID</label>
					<input type="text" class="form-control" id="categoryId"
						name="categoryId" value="${cat.catid}" required>
				</div>
				<div class="mb-3">
					<label for="categoryName" class="form-label">Category Name</label>
					<input type="text" class="form-control" id="categoryName"
						name="categoryName" value="${cat.categoryName}" required>
				</div>
				<div class="d-grid">
					<button type="submit" class="btn btn-primary">Save
						Category</button>
				</div>
			</form>
		</div>
	</div>

	<!-- Bootstrap JS (optional) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
