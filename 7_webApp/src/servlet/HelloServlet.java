package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/hello", "/hello.do" },loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public HelloServlet() {
    	System.out.println("HelloServlet() 객체 생성");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출");
	}
	public void destroy() {
		System.out.println("destroy() 호출");
	}

	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * response.setContentType("text/html; charset=utf-8");
	 * 
	 * System.out.println("doget() 호출");
	 * 
	 * 
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * 
	 * PrintWriter out = response.getWriter();
	 * 
	 * out.print("<h1> HelloServlet page 입니다. </h1>");
	 * 
	 * String name = request.getParameter("name"); String id =
	 * request.getParameter("id"); out.print("<h1>"+name+"||"+id+"</h1>"); //doget
	 * reload,요청처리 } protected void doPost(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * response.setContentType("text/html; charset=utf-8");
	 * request.setCharacterEncoding("utf-8"); System.out.println("dopost() 호출");
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * 
	 * PrintWriter out = response.getWriter();
	 * 
	 * out.print("<h1> HelloServlet page 입니다. </h1>"); String name =
	 * request.getParameter("name"); String id = request.getParameter("id");
	 * out.print("<h1>"+name+"||"+id+"</h1>"); //doGet(request, response); }
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get post 상관없이 실행
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println("service() 호출");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1> HelloServlet page 입니다. </h1>");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		out.print("<h1>"+name+"||"+id+"</h1>");
		//doGet(request, response);
	}

}
