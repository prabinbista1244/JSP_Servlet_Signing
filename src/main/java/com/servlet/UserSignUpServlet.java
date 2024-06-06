package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class UserSignUpServlet
 */
@WebServlet("/UserSignUpServlet")
public class UserSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("SignUp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting data from the SignUp.jsp file
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				Double phone = Double.parseDouble(request.getParameter("phone"));
				String password = request.getParameter("password");
				
				
				//Sending data to the database
				User u = new User();
				u.setName(name);
				u.setEmail(email);
				u.setPhone(phone);
				u.setPassword(password);
				
				UserService service = new UserServiceImpl();
				service.signUpUser(u);
				request.getRequestDispatcher("SignUpUserResult.jsp").forward(request, response);
	}

}
