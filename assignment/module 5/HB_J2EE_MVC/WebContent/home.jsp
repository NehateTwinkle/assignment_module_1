<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${model.uid>0 }">
<table border="1">
<tr>
<th>uid</th>
<th>firstname</th>
<th>lastname</th>
<th>username</th>
<th>password</th>
</tr>
<tr>
<td>${model.uid }</td>
<td>${model.firstname }</td>
<td>${model.lastname }</td>
<td>${model.username }</td>
<td>${model.password }</td>
<td><a href="homecontroller?action=edituser&uid=${model.uid }"></a>Edit user</td>
<td><a href="homecontroller?action=deleteuser&uid=${model.uid }"></a>delete user</td>
</tr>
</table>
</c:if>

<c:if test="${hmodel.uid>0 }">
<form method="post" action="homecontroller" >
<table>
<tr>
<td>First Name : </td>
<td><input type="text" name="firstname" value=${hmodel.firstname }></td>
</tr>
<tr>
<td>Last Name : </td>
<td><input type="text" name="lastname" value=${hmodel.lastname }></td>
</tr>
<tr>
<td>User Name : </td>
<td><input type="text" name="username" value=${hmodel.username }></td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password" name="password" value=${hmodel.password }></td>
</tr>

<tr>
<td>userid : </td>
<td><input type="hidden" name="uid" value=${hmodel.uid }></td>
</tr>
<tr>
<td><input type="submit" value="update"></td>
</tr>

</table>


</form>
</c:if>
</body>
</html>