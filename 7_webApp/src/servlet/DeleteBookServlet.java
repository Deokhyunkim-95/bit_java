package servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import dao.BookDAO_Oracle;
import service.BookService;
import service.BookServiceImpl;

@WebServlet("/deleteBook.do")
public class DeleteBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			                                             throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//String bookid = request.getParameter("bookid");
		String[] bookid = request.getParameterValues("bookid");
		//System.out.println("deleteBook.do  =>  "+Arrays.toString(bookid));
		
		BookDAO dao = new BookDAO_Oracle();
		BookService service = new BookServiceImpl(dao);
		
		try {
			for(String data :bookid) {
			   service.deleteBook(Integer.parseInt(data));
			}
			response.sendRedirect("listBook.do");
		} catch (Exception e) {
            request.setAttribute("exception", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}
}





