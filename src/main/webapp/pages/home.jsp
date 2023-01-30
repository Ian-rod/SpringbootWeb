<!DOCTYPE html>
<html>
<head>
<script>
function myDate()
{
document.getElementById("demo").innerHTML=Date();
}
</script>
<link rel="stylesheet" href="login.css">
<style>
</style>
<title>
Form page
</title>
</head>
<body>
<h1>My log in page</h1>
<form autocomplete="on" method="post" >
<fieldset>
<legend> Log in</legend>
<label for="idname">
ID:
</label>
<br>
<input type="text" id="ID" name ="ID"><br>
<label for="uname">
Username:
</label>
<br>
<input type="text" id="name" name ="name" required><br>

<label for="pass">
Password:
</label>
<br>
<input type="password" id="password" name ="password"><br>
<h2>Enter your gender</h2>
<input type="radio" id="male" name="gender" value="male">
<label for="male">
Male
</label>
<input type="radio" id="female" name="gender" value="female">
<label for="female">
Female
</label>
<input type="radio" id="none" name="gender" value="none" onclick=display()>
<label for="none">
None
 </label>
 <br>
 <br>
 <input type="submit" onclick="window.alert('Successfully signed up')"><br>
</fieldset>
<br>
<br>
<h1></h1>
<p id="demo"></p>
<br>
<br>
</form>
</body>
</html>