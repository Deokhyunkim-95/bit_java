package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import dao.FoodshopDao;
import json_jdbc.JsonDB;
import service.FoodShopService;
import service.FoodShopServiceimpl;
import vo.FoodshopVO;

@WebServlet("/Showfoodshop.do")
public class Showfoodshop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8"); 
		
		 System.out.println("/Showfoodshop.do 요청 처리");
		
		 String fname = request.getParameter("fname");
		 
		 FoodshopDao dao = new FoodshopDao();
	     FoodShopService service = new FoodShopServiceimpl(dao);
	     List<FoodshopVO> list = service.showfoodshop(fname);
	     
	     JsonDB.jsonfoodshop(fname);
	     
	     request.setAttribute("showfoodshop", list);
	     String view = "/showfoodshop.jsp";
	     
	     getServletContext().getRequestDispatcher(view).forward(request, response);
	     
	
	}

}
