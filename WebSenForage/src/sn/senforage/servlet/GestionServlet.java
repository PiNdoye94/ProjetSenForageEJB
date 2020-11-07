package sn.senforage.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.IClientLocal;
import sn.senforage.dao.IVillageLocal;

/**
 * Servlet implementation class GestionServlet
 */
@WebServlet("/GestionClients")
public class GestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private IVillageLocal village_dao;
	private IClientLocal client_dao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listClient", client_dao.findAll());
		request.setAttribute("listVillage", village_dao.findAll());
		request.getRequestDispatcher("Clients/ListClient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
