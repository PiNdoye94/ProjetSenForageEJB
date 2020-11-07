package sn.senforage.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.senforage.dao.IUserLocal;
import sn.senforage.entities.Users;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private IUserLocal user_dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }
    
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("Login.jsp").forward(request, response);
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String username = request.getParameter("identifiant"); 
		  String password = request.getParameter("password");
		  
		  Users user = user_dao.checkLogin(username,password); 
		  String destPage = "Login.jsp";
		  
		  if (user != null) { 
			  
			  HttpSession session = request.getSession();
			  session.setAttribute("user", user); 
			  destPage = "Accueil.jsp"; 
			  
		  } else {
			  
			  String message = "Identifiant ou Mot de passe Invalide!!";
			  request.setAttribute("message", message); }
			  
			  RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
			  dispatcher.forward(request, response);	
			  
	      }
}


