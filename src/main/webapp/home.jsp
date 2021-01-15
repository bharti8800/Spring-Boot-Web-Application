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

	Items
	<ul>
		<li> ${ itemList } </li>
	</ul>
	<br><br>
<ul>
	<li>Create a new Item</li>
	<br><br>
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
	<br><br><br>
	<li>View all items</li>
	<br><br>
	<li>View Item</li>
	<form method="GET" action="/item">
	Serial Id: <input type="text" name="serialId"><br>
	<input type="submit" value="submit"><br>
	</form>
	Serial id- ${item.serialId}, Item name-${item.name}
	, Quantity- ${item.quantity}
	<br><br><br>
	<li>Update Item</li>
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
	<input type="submit" value="Update">
	</form>
	
	<br><br><br>
	<li>Delete Item</li>
	<form action="/deleteItem" method="GET">
	Serial Id -<input type="text" name="id">
	<br>
	<input type="submit" value="Delete">
	</form>
</ul>
</body>
</html>