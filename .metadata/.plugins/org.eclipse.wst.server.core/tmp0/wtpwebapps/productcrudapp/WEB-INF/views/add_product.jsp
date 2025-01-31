<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container">

		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center">Fill The Product Details</h1>

				<form action="handle-product" method="post">

					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Product Name Here" />
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" name="description" id="description"
							rows="5" placeholder="Enter The Product Description"></textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label><input type="text"
							placeholder="Enter Product price" name="price"
							class="form-control" id="price" />
					</div>

					<div class="form-group">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>

						<button type="submit" class="btn btn-outline-primary">Add Product</button>
					</div>
				</form>
			</div>
		</div>

	</div>

</body>
</html>