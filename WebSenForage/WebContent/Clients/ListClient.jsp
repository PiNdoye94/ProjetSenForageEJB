<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Gestion Clients</title>
	<link rel="stylesheet" href="public/css/Styles.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div class="wrapper">
		<div class="wrapper_inner">
			<div class="vertical_wrap">
			<div class="backdrop"></div>
			<div class="vertical_bar">
				<div class="profile_info">
					<div class="img_holder">
						<img src="public/image/lol.png" alt="profile_pic">
					</div>
					<p class="title">Responsable Clientèle</p>
					<p class="sub_title">papisndoye218@gmail.com</p>
				</div>
				<ul class="menu">
					<li><a href="<%=request.getContextPath()%>/accueil">
						<span class="icon"><i class="fas fa-home"></i></span>
						<span class="text">Accueil</span>
					</a></li>
					<li><a href="<%=request.getContextPath()%>/nouveauclient">
						<span class="icon"><i class="fas fa-user"></i></span>
						<span class="text">Nouveau Client</span>
					</a></li>
					<li><a href="#" class="active">
						<span class="icon"><i class="fas fa-cog"></i></span>
						<span class="text">Gestion Clients</span>
					</a></li>
				</ul>
				<h3 class="out"><a href="" >Deconnexion</a></h3>
			</div>
		</div>
		<div class="main_container">
			<div class="top_bar">
				<div class="hamburger">
					<i class="fas fa-bars"></i>
				</div>
				<div class="logo">
					GESTION <span>CLIENTS</span>
				</div>
			</div>

			<div class="container">
				<div class="content">
					<div class="item">
						<table class="table">
							<tr>
<!-- 								<th scope="col">ID</th> -->
								<th scope="col">Nom</th>
								<th scope="col">Prenom</th>
								<th scope="col">Telephone</th>
								<th scope="col">Adresse</th>
								<th scope="col">Village</th>
							</tr>
							<tr>
								<c:forEach var="c" items="${listClient}">
									<tr>
<%-- 										<th scope="row">${c.id}</th> --%>
										<td>${c.nom}</td>
										<td>${c.prenom}</td>
										<td>${c.telephone}</td>
										<td>${c.adresse}</td>
										<td>${c.village.nomVillage}</td>
<%-- 										<td><a href="edit?id=<c:out value='${c.id}'/>">Edit</a></td>			 --%>
<%-- 										<td><a href="delete?id=<c:out value='${c.id}'/>">Delete</a></td> --%>
									</tr>
								</c:forEach>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
		</div>
	</div>

</body>
</html>