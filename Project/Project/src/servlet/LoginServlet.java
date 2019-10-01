package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import service.UserService;
import service.UserServiceImpl;
import vo.UserVO;

@WebServlet({ "/login.do", "/logout.do" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect("./main.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//String name = request.getParameter("name");
		//String role = request.getParameter("role");

		
		if (id == null || pw == null || id.length() == 0 || pw.length() == 0) {
			// response.sendRedirect("./login.jsp");
			request.setAttribute("msg", "pw 정보를 다시 입력하세요.");
			request.setAttribute("id", id);
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		
		
		UserDao dao = new UserDao();
		UserService service = new UserServiceImpl(dao);
		UserVO vo = new UserVO();
		
		vo.setId(id);
		vo.setPassword(pw);
		//vo.setName(name);
		//vo.setRole(role);
		
		UserVO count = null;
		count = service.login(vo);
		
		System.out.println("Servlet count  login =>  "+count);

		//System.out.println("/login.do");
		//System.out.println("servlet:" + count.getId() + "/" +count.getName()+"/"+count.getRole());

		

		if (count == null ) {
			request.setAttribute("msg", "로그인 실패");
			request.setAttribute("id", id);
			request.getRequestDispatcher("login.jsp").forward(request, response);

			return;
			
			
//			request.getRequestDispatcher("main.jsp").forward(request, response);

		} 
		session.setAttribute("login", count.getName());
		session.setAttribute("id", count.getId());
		session.setAttribute("role", count.getRole());
		out.println("<script>alert('로그인 완료 되었습니다.');opener.location.reload();window.close();</script>" );
		
	}

}
