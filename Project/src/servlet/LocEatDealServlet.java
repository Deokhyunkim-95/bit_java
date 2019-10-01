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

@WebServlet("/loc_eatdeal.do")
public class LocEatDealServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html;charset=utf-8");
	request.setCharacterEncoding("utf-8");
	
	String loc = request.getParameter("loc2");
	System.out.println(loc);
	
	System.out.println("/loc_eatdeal.do 요청 처리");
	
	FoodshopDao dao = new FoodshopDao();
	FoodShopService service = new FoodShopServiceimpl(dao);
	
	List<FoodshopVO> list = new ArrayList<FoodshopVO>();
	
		list.addAll(service.locsearch(loc));
	
	System.out.println(list);
	
	request.setAttribute("loc_eatdeal_list", list);
	request.setAttribute("loc", loc);
	
	String view = "/eat_deal.jsp";
	
	getServletContext().getRequestDispatcher(view).forward(request, response);
	
	}

	
}
