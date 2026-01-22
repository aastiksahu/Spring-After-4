<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="Header.jsp"%>
	<sf:form method="post" modelAttribute="form">
		<div align="center">
			<h1 style="color: navy">User Registration</h1>
			<span style="color: green">${msg}</span> <span style="color: red">${emsg}</span>
			<table>
				<tr>
					<th align="left">First Name :</th>
					<td><sf:input path="firstName" placeholder="Enter First Name" /></td>
				</tr>

				<tr>
					<th align="left">Last Name :</th>
					<td><sf:input path="lastName" placeholder="Enter Last Name" /></td>
				</tr>

				<tr>
					<th align="left">Login ID :</th>
					<td><sf:input path="login" placeholder="Enter Login ID" /></td>
				</tr>

				<tr>
					<th align="left">Password :</th>
					<td><sf:input path="password" placeholder="Enter Password" /></td>
				</tr>

				<tr>
					<th align="left">Date Of Birth :</th>
					<td><sf:input path="dob" placeholder="Enter Date Of Birth" /></td>
				</tr>

				<tr>
					<th align="left">Address :</th>
					<td><sf:input path="address" placeholder="Enter Address" /></td>
				</tr>

				<tr>
					<th></th>
					<td><input type="submit" name="operation" value="signUp"></td>
				</tr>
			</table>
		</div>
	</sf:form>

</body>
</html>