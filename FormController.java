package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TodoDao;
import dao.TodoImplement;
import entity.Todo;

//@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TodoDao dao = null;
	
	public FormController() {

		dao = new TodoImplement();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response){}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Todo obj = new Todo();
		obj.setMail(request.getParameter("mail"));
		obj.setPhone(request.getParameter("ph_no"));
		obj.setName(request.getParameter("name"));
		String todoTitle = "";
		if (dao.save(obj)) {
			request.setAttribute("NOTIFICATION", "todo saved Successfully");
			todoTitle = "Data inserted";
			request.setAttribute("todotitle", todoTitle);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
			dispatcher.forward(request, response);
		}
		System.out.print(obj);

	}
}
