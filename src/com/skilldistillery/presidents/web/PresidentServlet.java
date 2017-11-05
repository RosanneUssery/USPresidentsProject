package com.skilldistillery.presidents.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.presidents.data.President;
import com.skilldistillery.presidents.data.PresidentDAO;
import com.skilldistillery.presidents.data.PresidentDAOImpl;

public class PresidentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PresidentDAO presDAO;
	
	@Override
	public void init() throws ServletException {
		presDAO = new PresidentDAOImpl(getServletContext());
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String term = request.getParameter("term");
		int termNumAsInt = Integer.parseInt(term);
		President pres = presDAO.getPresByTerm(termNumAsInt);
		
		request.setAttribute("president", pres);
		request.getRequestDispatcher("/pres.jsp").forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
