<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Authentification</title>
	<link href="public/css/Login.css" type="text/css" rel="stylesheet">
</head>
<body>

	<div class="container">
	<!--img src="image/login.png"/-->
		<form action="<%=request.getContextPath()%>/Login" method="POST">
			<div>
				<h1>Authentification</h1>
			</div>
			<div class="form-input">
				<input type="text" name="identifiant" placeholder="Identifiant"/>	
			</div>
			<div class="form-input">
				<input type="password" name="password" placeholder="Mot de passe"/>
			</div>
			${message}<br>
			<input type="submit" type="submit" name="connexion" value="LOGIN" class="btn-login"/>
		</form>
		<div>
			<p>Mot de passe oublié, <a href="">réinitialiser</a></p>
		</div>
	</div>

</body>
</html>