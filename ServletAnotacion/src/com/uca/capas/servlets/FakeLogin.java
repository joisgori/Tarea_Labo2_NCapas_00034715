package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FakeLogin
 */
@WebServlet("/FakeLogin")
public class FakeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FakeLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nUserQuemado = "Romeo";
		String nPassQuemada = "12345";
		
		String nUsuario = (request.getParameter("usuario"));
		String nContra = request.getParameter("contraseña");//)request.getParameter("contraseña").toString();
		
		if(nUserQuemado.equals(nUsuario) && nPassQuemada.equals(nContra)) {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>"+"El usario " + nUsuario + " y contraseña es correcto"+"</h2>");
			out.println("</body>");	
			out.println("</html>");
		} else {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>"+"El usario " + nUsuario + " o contraseña es incorrecto"+"</h2>");
			out.println("</body>");	
			out.println("</html>");
		}
		
		
	}

}
