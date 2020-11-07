<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Sen-Forage</title>
<link href="public/css/Styles.css" type="text/css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<!-- <h1>Bienvenue sur la plateforme de gestion des clients de Sen-forage</h1> -->
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
					<p class="sub_title">${user.prenom} (${user.nom})</p>
				</div>
				<ul class="menu">
					<li><a href="#" class="active">
						<span class="icon"><i class="fas fa-home"></i></span>
						<span class="text">Accueil</span>
					</a></li>
					<li><a href="<%=request.getContextPath()%>/nouveauclient">
						<span class="icon"><i class="fas fa-user"></i></span>
						<span class="text">Nouveau Client</span>
					</a></li>
					<li><a href="<%=request.getContextPath()%>/gestionclient">
						<span class="icon"><i class="fas fa-cog"></i></span>
						<span class="text">Gestion Clients</span>
					</a></li>
				</ul>

				<h3 class="out"><a href="Logout" >Deconnexion</a></h3>
			</div>
		</div>
		<div class="main_container">
			<div class="top_bar">
				<div class="hamburger">
					<i class="fas fa-bars"></i>
				</div>
				<div class="ogo">
					ACCUEIL <span></span>
				</div>
			</div>

			<div class="container">
				<div class="content">
					<div class="item">
		                <div class="donneesClient" style="text-align: center;">
		                    <form method="POST" action="<%=request.getContextPath()%>/Accueil">
			                    <input type="text" name="nvillage" class="btn_add" placeholder=""/>
			                    <input type="submit" name="new_village" class="btn_add" value="Nouveau Village"/>
		                    </form>
		                </div>
		                <div class="card-body">
		                  	<table class="table">
								<tr>
									<th scope="col">ID</th>
									<th scope="col">Nom-Village</th>
								</tr>
				
								<tr>
									<c:forEach var="v" items="${listVillage}">
										<tr>
											<th scope="row">${v.id}</th>
											<td>${v.nomVillage}</td>
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
	</div>
</body>
</html>