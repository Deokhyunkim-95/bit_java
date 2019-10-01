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

@WebServlet("/main_foodstyle.do")
public class MainFoodstyleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String food = request.getParameter("food");
		System.out.println(food);
		
		
		System.out.println("/koreanFood.do 요청 처리");
		
		FoodshopDao dao = new FoodshopDao();
		FoodShopService service = new FoodShopServiceimpl(dao);
		
		List<FoodshopVO> list = new ArrayList<FoodshopVO>();
		
			list.addAll(service.foodstylesearch(food));
		
		System.out.println(list);
		
		request.setAttribute("foodstyle_list", list);
		
		String view = "/foodstyle.jsp";
	
		getServletContext().getRequestDispatcher(view).forward(request, response);
	}

}
