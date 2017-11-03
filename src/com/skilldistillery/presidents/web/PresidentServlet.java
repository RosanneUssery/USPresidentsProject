package com.skilldistillery.presidents.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

		/*HttpSession session = request.getSession();
		Presidents president = (Presidents) session.getAttribute("presidents");
		if (president == null) {
			president = new Presidents(0, null, null, null, 0, null, null);
			session.setAttribute("presidents", president);
		}
		*/
		
		String pres = request.getParameter("pres");
		try {
			if (pres != null) {
				int term = Integer.parseInt(pres);
				PresidentDAO p = (PresidentDAO) dao.getPresByTerm(term);
			}
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}

		List<PresidentDAO> presidential = dao.getAllPresidents();
		request.setAttribute("president", presidential);
		
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
