package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FoodshopDao;
import service.FoodShopService;
import service.FoodShopServiceimpl;
import vo.FoodshopVO;

/**
 * Servlet implementation class FnameServlet
 */
@WebServlet("/fname.do")
public class FnameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글 안 깨지게 하기 위한 코드 2줄
				response.setContentType("text/html;charset=utf-8");
				request.setCharacterEncoding("utf-8");
				
				String fname = request.getParameter("keyword");
				
				System.out.println(fname);
				
				System.out.println("/fname.do 요청 처리");
				
				FoodshopDao dao = new FoodshopDao();
				FoodShopService service = new FoodShopServiceimpl(dao);
				
				List<FoodshopVO> list = new ArrayList<FoodshopVO>();
				
					list.addAll(service.fnamesearch(fname));
				
				System.out.println(list);
					
				request.setAttribute("fname_list", list);
				request.setAttribute("fname", fname );
				
				String view = "/fname.jsp";
				
				getServletContext().getRequestDispatcher(view).forward(request, response);
				
		
	}

}
