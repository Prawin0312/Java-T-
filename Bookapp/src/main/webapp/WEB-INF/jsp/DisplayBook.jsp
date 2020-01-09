<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
<form action="bookCRUD">
		<table align=center width=50%>
			<tr>
				<th>Book id</th>
				<td><input type=text name=bookid value=${b.bookid } ></td>
			</tr>
			<tr>
				<th>Book title</th>
				<td><input type=text name=booktitle value=${b.booktitle }></td>
			</tr>
			<tr>
				<th>Price</th>
				<td><input type=text name=price value=${b.price }></td>
			</tr>
			<tr>
			    <th>Author</th>
			    <td><input type=text name=author value=${b.author }></td>
			</tr>
			<tr>
				<td><input type=submit value="Add_Book" name="sub"></td>
				<td><input type=submit value="Del_Book" name="sub"></td>
				<td><input type=submit value="Mod_Book" name="sub" ></td>
				<td><input type=submit value="Get_Book" name="sub"></td>
			</tr>
		</table>
	</form>
</body>
</html>