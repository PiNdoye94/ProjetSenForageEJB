package sn.senforage.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.entities.Client;
import sn.senforage.entities.Village;
import sn.senforage.dao.IClientLocal;
import sn.senforage.dao.IVillageLocal;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/NouveauClient")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private IClientLocal client_dao;
	private IVillageLocal village_dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listVillage", village_dao.findAll());
		request.setAttribute("listClient", client_dao.findAll());
		request.getRequestDispatcher("Clients/AddClient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String telephone = request.getParameter("telephone");
		
		Village v = new Village();
		int id = Integer.parseInt(request.getParameter("village"));
        v = village_dao.getVillageById(id);
        
        Client c = new Client();
        
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAdresse(adresse);
		c.setTelephone(telephone);
		c.setVillage(v);

		client_dao.save(c);
		
		//request.getRequestDispatcher("gestionclient").forward(request, response);
		response.sendRedirect("gestionclient");
	}

}
