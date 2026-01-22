<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<sf:form method="post" modelAttribute="form">
		<div align="center">
			<h1 style="color: navy">Login</h1>
			<span style="color: green">${msg}</span> <span style="color: red">${emsg}</span>
			<table>
				<tr>
					<th align="left">Login Id :</th>
					<td><sf:input path="login" placeholder="Enter Your Login Id" /></td>
				</tr>

				<tr>
					<th align="left">Password :</th>
					<td><sf:input path="password" placeholder="Enter Your Password"  /></td>
				</tr>

				<tr>
					<th></th>
					<td><input type="submit" name="operation" value="signIn"></td>
				</tr>
			</table>
		</div>
	</sf:form>

</body>
</html>