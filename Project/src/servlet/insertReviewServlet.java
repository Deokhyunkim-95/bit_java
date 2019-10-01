package servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.ReviewDAO;
import service.ReviewService;
import service.ReviewServiceImpl;
import vo.ReviewVO;

@WebServlet("/insertReview.do")
@MultipartConfig(maxFileSize = 1024*1024*5)
public class insertReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		HttpSession session=request.getSession();
		Object a = session.getAttribute("id");	
		
		int fid = Integer.parseInt(request.getParameter("fid"));
		String fname = request.getParameter("fname");
		
		System.out.println("넘어온 fid"+fid);
		System.out.println("넘어온 fname"+fname);
		System.out.println("aaaa"+a);
		System.out.println(request.getParameter("text"));
		System.out.println(request.getParameter("eval"));
		System.out.println("////////////////");
		
		System.out.println("/insertReview.do 요청 처리"); 		
	
		ReviewDAO dao = new ReviewDAO();
		ReviewService service = new ReviewServiceImpl(dao);
		ReviewVO vo = new ReviewVO();
		String path = request.getRealPath("/upload/");
		
		
		vo.setUserid((String) a);
		vo.setFid(fid);
		
		
		Collection<Part> parts = request.getParts();
		for(Part p : parts) {
			if(p.getContentType() != null) {
				String fileName = p.getSubmittedFileName();
				if(fileName != null && fileName.length() != 0) {
					p.write(path+fileName);
					vo.setImage("./upload/"+fileName);
					System.out.println(vo);
				}
			}
		}
		
		vo.setText(request.getParameter("text"));
		vo.setEval(request.getParameter("eval"));
		
		
		try {
			service.addReview(vo);			
			response.sendRedirect("listreview.do?fid="+fid+"&fname="+URLEncoder.encode(fname)); 
		} catch (Exception e) {
			
			System.out.println("~~~~~~~~~~~~~~~~~~");
			/*
			 * request.setAttribute("exception", new Exception("등록 데이터 확인 후 다시 등록하세요 "));
			 * getServletContext().getRequestDispatcher("/error.jsp").forward(request,
			 * response);
			 */
		}
	}

}
