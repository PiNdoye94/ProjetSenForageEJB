<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Nouveau Client</title>
	<link href="public/css/Styles.css" type="text/css" rel="stylesheet">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
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
					<li><a href="#"  class="active">
						<span class="icon"><i class="fas fa-user"></i></span>
						<span class="text">Nouveau Client</span>
					</a></li>
					<li><a href="<%=request.getContextPath()%>/gestionclient">
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
					Nouveau <span>Client</span>
				</div>
			</div>

			<div class="container">
				<div class="content">
					<div class="item">
						<form id="formulaire" name="formouverture" action="<%=request.getContextPath()%>/NouveauClient" method="POST">  
			                <fieldset class="donneesClient">
			                	<legend>Informations client</legend>
			                		<select name="village">
			                			<option selected>Selectionner un Village</option>
			                			<c:forEach var="v" items="${listVillage}">
											<option value="${v.id}">${v.nom_village}</option>
										</c:forEach>
			                		</select>
			                		
			                        <div>
			                            <label for="lname">Nom<span id="error_nom"></span> </label>
			                            <input type="text" id="lname" name="nom" class="input_saisi" value="" />
			                            <span id="error_nomMessage"></span>
			                        </div>
			                        <div>   
			                            <label for="fname">Prénom<span id="error_prenom"></span> </label>
			                            <input type="text" id="fname" name="prenom" class="input_saisie"/>
			                            <span id="error_prenomMessage"></span>
			                        </div>
			                        <div>
			                            <label for="adress">Adresse<span id="error_adress"></span></label>
			                            <input type="text" id="adress" name="adresse" class="input_saisi"/>
			                            <span id="error_adressMessage"></span>
			                        </div>
			                        <div>
			                            <label for="phone">Téléphone<span id="error_phone"></span> </label>
			                            <input type="tel" id="phone" name="telephone" class="input_saisi"/>
			                            <span id="error_phoneMessage"></span>
			                        </div>
			                       
			                </fieldset>

			                <div id="save">
			                    <input type="submit" class="bouton" id="boutonsave" name="envoyer" value="Enregistrer">
			                    <input type="reset" class="bouton" value="Annuler">    
			                </div>

			                <div id="message">  

			                </div>

			          	</form>
					</div>
				</div>
			</div>
		</div>
		</div>
	</div>
</body>
</html>