package com.skilldistillery.presidents.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.presidents.data.President;
import com.skilldistillery.presidents.data.PresidentDAO;
import com.skilldistillery.presidents.data.PresidentDAOImpl;

/**
 * Servlet implementation class PresidentServlet
 */

public class PresidentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PresidentServlet() {
        super();
    }
    

	private PresidentDAO dao = new PresidentDAOImpl(this.getServletContext());


	/*public void init() {
		dao = new PresidentDAOImpl();
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String term = request.getParameter("term");
		int termNumAsInt = Integer.parseInt(term);
		President pres = dao.getPresByTerm(termNumAsInt);
		
		if (pres != null) {
			request.setAttribute("stock", pres);
			request.getRequestDispatcher("/request.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
		
		/*HttpSession session = request.getSession();
		Presidents president = (Presidents) session.getAttribute("presidents");
		if (president == null) {
			president = new Presidents(0, null, null, null, 0, null, null);
			session.setAttribute("presidents", president);
		}
		*/
		
		/*String president= request.getParameter("president");
		try {
			if (pres != null) {
				int termp = Integer.parseInt(pres);
				PresidentDAO p = (PresidentDAO) dao.getPresByTerm(termp);
			}
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}*/

		List<President> termp = dao.getAllPresidents();
		request.setAttribute("term", termp);
		List<President> lastName = dao.getAllPresidents();
		request.setAttribute("name", lastName);
		
		request.getRequestDispatcher("/pres.jsp").forward(request, response);
		
		

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
