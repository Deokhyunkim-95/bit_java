package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReviewDAO;
import service.ReviewService;
import service.ReviewServiceImpl;
import vo.ReviewVO;

@WebServlet("/listreview.do")
public class ListReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		int fid = Integer.parseInt(request.getParameter("fid"));
		String fname = request.getParameter("fname");
		
		System.out.println("listreviewservlet fid/////"+fid);
		System.out.println("listreviewservlet fname////"+fname);
		
		System.out.println("/listreview.do 요청 처리"); 
	
        ReviewDAO dao = new ReviewDAO();
		ReviewService service = new ReviewServiceImpl(dao);
		List<ReviewVO> list = service.reviewList(fid);
		
		
		request.setAttribute("reviewlist", list);
		String view = "/reviewlist.jsp"; 
		
		getServletContext().getRequestDispatcher(view).forward(request, response); 
		
		
	}
}
