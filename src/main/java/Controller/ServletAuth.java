package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modele.entities.utilisateur;
import modele.metiers.ModelUser;

import java.io.IOException;

/**
 * Servlet implementation class ServletAuth
 */
public class ServletAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAuth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("email");
        System.out.println(username);
        String password = request.getParameter("pw");
        System.out.println(password);
        utilisateur user = new utilisateur(username, password);
        System.out.println(user);
        ModelUser utilDao = new ModelUser();
        utilDao.SetU(user);
        if( utilDao.authentifier())
        {
          request.setAttribute("username",username);
          request.getRequestDispatcher("Bienvenue.jsp").forward(request, response);
        
       }
        else
        {
        	response.sendRedirect("Error.html");
        }
        }

}

