<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Leads</title>
</head>
<body>
      <h2> Lead | save</h2>
      <form action="saveLead" method="post">
			<pre>
				First Name	<input type="text" name="firstName"/><br/>
				Last Name	<input type="text" name="lastName"/><br/>
				Lead Source	<select name="leadSource">
								<option value="newsPaper">News Paper</option>
								<option value="tv">Television</option>
								<option value="Radio">Radio</option>
								<option value="online">Online</option>
						   	</select><br/>
			    Email  <input type="email" name="email"/><br/>
				Number <input type="text" name="number"/><br/>
				<input type="submit" name="submit">
				</pre>
	 </form>
	 
	 ${msg}
</body>
</html>