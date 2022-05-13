<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- CSS only -->
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
			crossorigin="anonymous"
		/>

		<title>Create User Portal</title>
	</head>
	<body>
		<form method="post" action="AddUserServlet">
			<label for="id">ID</label>
			<input type="text" name="id" placeholder="ID" />

			<label for="name">Name</label>
			<input type="text" name="name" placeholder="Name" />

			<label for="email">Email</label>
			<input type="email" name="email" placeholder="Email" />

			<input type="submit" value="submit" />
		</form>
	</body>
</html>
