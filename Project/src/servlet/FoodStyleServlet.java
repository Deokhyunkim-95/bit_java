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
 * Servlet implementation class FoodStyleServlet
 */
@WebServlet("/foodstyle.do")
public class FoodStyleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String foodstyle = request.getParameter("foodstyle_list");
		System.out.println(foodstyle);
		
		System.out.println("/foodstyle.do 요청 처리");
		
		FoodshopDao dao = new FoodshopDao();
		FoodShopService service = new FoodShopServiceimpl(dao);
		
		List<FoodshopVO> list = new ArrayList<FoodshopVO>();
		
			list.addAll(service.foodstylesearch(foodstyle));
		
		System.out.println(list);
		
		request.setAttribute("foodstyle_list", list);
		request.setAttribute("foodstyle", foodstyle + " 맛집");
		
		String view = "/foodstyle.jsp";
		
		getServletContext().getRequestDispatcher(view).forward(request, response);
	}

}
