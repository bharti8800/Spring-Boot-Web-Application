<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h2>Home page</h2>
<ul>
	<li>Create a new Item</li>
	<div name="div1">
	Create a new Item
	<form action="/item" method="post">
	<label>Serial ID</label>
	<input type="text" name="serialId">
	<br>
	<label>Name</label>
	<input type="text" name="name">
	<br>
	<label>Quantity</label>
	<input type="text" name="quantity">
	<br>
	<input type="submit" value="Save">
	</form>
	</div>
	<li>View all items</li>
	<li>View Item</li>
	<li>Update Item</li>
	<li>Delete Item</li>
</ul>
</body>
</html>