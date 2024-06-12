<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>complex form</title>
</head>
<body>
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						<form action="handleForm" method="post">
							<div class="form-group">
								<label for="exampleFormControlInput1">Your Name</label> <input
									type="text" class="form-control" id="exampleFormControlInput1"
									placeholder="Enter Name" name="userName">
							</div>

							<div class="form-group">
								<label for="exampleFormControlInput1">Your Email</label> <input
									type="email" class="form-control" id="exampleFormControlInput1"
									placeholder="Enter ID" name="userEmail">
							</div>
							<div class="form-group">
								<label for="dob">Your DOB</label> <input type="date"
									name="userDOB" class="form-control" placeholder="dd/mm/yyyy">
							</div>
							<div class="form-group">
								<label for="exampleFormControlSelect2">Select Courses</label> <select
									multiple class="form-control" id="exampleFormControlSelect2"
									name="userCourses">
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>DJango</option>
									<option>Kotlin</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="userGender"
										id="exampleRadios2" value="male"> <label
										class="form-check-label" for="exampleRadios2"> Male </label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="userGender"
										id="exampleRadios2" value="female"> <label
										class="form-check-label" for="exampleRadios2"> Female
									</label>
								</div>
							</div>

							<div class="form-group">
								<label for="">Select Type</label> <select class="form-control"
									name="userType">
									<option value="oldStudent">Old Student</option>
									<option value="normalStudent">Normal Student</option>
								</select>
							</div>

							<div class="card">
								<div class="card-body">

									<p>Enter Your Address</p>
									<div class="form-control">
										<input name="address.userStreet" type="text" placeholder="Enter Your Street">
									</div>
									<div class="form-control">
										<input name="address.userCity" type="text" placeholder="Enter Your City">
									</div>

								</div>
							</div>


							<button type="submit" class="btn btn-success">Submit</button>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>