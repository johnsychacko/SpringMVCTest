<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>

<form action="addstudent" method="post">
	${BOOK_MSG}
	<table>
		<tr>
			<td>
				Roll: 
			</td>
			<td>
				<input type="text" name="roll"/>
			</td>
		</tr>
		<tr>
			<td>
				Name: 
			</td>
			<td>
				<input type="text" name="name"/>
			</td>
		</tr>
		<tr>
			<td>
				Address: 
			</td>
			<td>
				<input type="text" name="address"/>
			</td>
		</tr>
		<tr>
			<td>
				Mobile no: 
			</td>
			<td>
				<input type="text" name="mobileNumber"/>
			</td>
		</tr>
		<tr>
			<td>
				Email-Id: 
			</td>
			<td>
				<input type="text" name="emailId"/>
			</td>
		</tr>
		<tr>
			<td>
				
			</td>
			<td>
				<input type="submit" value="Save"/>
			</td>
		</tr>
	
	</table>


</form>


</body>
</html>