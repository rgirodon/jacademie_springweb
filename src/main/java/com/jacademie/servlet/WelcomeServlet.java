/*
 * 
 */
package com.jacademie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.jacademie.domain.Book;
import com.jacademie.service.BookService;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet(urlPatterns="/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		
		BookService bookService = ctx.getBean("bookService", BookService.class);
		
		Book book = bookService.findBook();
		
		request.setAttribute("book", book);
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

}
