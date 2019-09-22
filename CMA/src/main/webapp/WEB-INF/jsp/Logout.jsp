<!DOCTYPE html>
<html>
<head>
<script type = "text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Logoutuser">

<br/>
<br/>
<center>
Do you want to really logout?<br/><br/>
<input type="submit" name="submit" value="logout"/>
<br/><br/>

</center>
</form>
</body>
</html>