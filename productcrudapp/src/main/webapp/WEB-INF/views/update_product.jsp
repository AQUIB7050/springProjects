<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container">

		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center">Change Product Details</h1>

				<form action="${pageContext.request.contextPath }/handle-product" method="post">

					<input type="hidden" name="id" value="${product.id }" />

					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Product Name Here" value="${product.name }" />
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" name="description" id="description"
							rows="5" placeholder="Enter The Product Description">${product.description }</textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label><input type="text"
							placeholder="Enter Product price" name="price"
							class="form-control" id="price" value="${product.price }" />
					</div>

					<div class="form-group">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-warning">Cancel</a>

						<button type="submit" class="btn btn-outline-success">Update
							Product</button>
					</div>
				</form>
			</div>
		</div>

	</div>

</body>
</html>