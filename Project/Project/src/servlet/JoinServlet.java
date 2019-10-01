package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import dao.UserDao;
import service.UserService;
import service.UserServiceImpl;
import vo.UserVO;



@WebServlet("/join.do")//폼액션
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		
		System.out.println("/join.do 요청 처리");
		
		UserVO vo = new UserVO();
		UserDao dao = new UserDao();
		UserService service = new UserServiceImpl(dao);

		String hashed = BCrypt.hashpw(request.getParameter("pw"), BCrypt.gensalt(10));
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(hashed);
		vo.setName(request.getParameter("name"));
		vo.setRole(request.getParameter("role"));
		
		//회원가입암호화
		try {
		service.addUser(vo);		
		out.println("<script>alert('등록이 완료 됬습니다.'); location.href='main.jsp';</script>");
//		response.sendRedirect("main.jsp");
	}catch (Exception e) {
		System.out.println(e);
		request.setAttribute("exception", new Exception("등록 데이터 입력을 확인후 다시 등록해주세요."));
		getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
		
	}
}
}
