package com.skilldistillery.presidents.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.presidents.data.PresidentDAO;
import com.skilldistillery.presidents.data.PresidentDAOImpl;
import com.skilldistillery.presidents.data.Presidents;

/**
 * Servlet implementation class PresidentServlet
 */
@WebServlet("/PresidentServlet")
public class PresidentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PresidentServlet() {
        super();
    }
    

	private PresidentDAO dao = new PresidentDAOImpl();


	public void init() {
		dao = new PresidentDAOImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try {
			if (prod != null) {
				long upc = Long.parseLong(prod);
				Product p = dao.getProductByUPC(upc);
				if (p != null) {
					cart.add(p);
					request.setAttribute("product", p);
				}
			}
		}
		/* result = p.toString() + " added to cart"; */
		catch (NumberFormatException e) {
			e.printStackTrace();
		}

		List<PresidentDAO> pres = dao.getAllPresidents();
		request.setAttribute("president", pres);
		
		request.getRequestDispatcher("/pres.jsp").forward(request, response);
		
		

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
