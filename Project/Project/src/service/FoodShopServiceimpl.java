package service;

import java.util.List;

import dao.FoodshopDao;
import vo.FoodshopVO;

public class FoodShopServiceimpl implements FoodShopService {

	
	FoodshopDao dao;
	
	public FoodShopServiceimpl() {}
	
	public FoodShopServiceimpl(FoodshopDao dao) {
		super();
		this.dao =dao;
		
	}
	
	
	
	
	public FoodshopDao getDao() {
		return dao;
	}

	public void setDao(FoodshopDao dao) {
		this.dao = dao;
	}

	@Override
	public int addFoodshop(FoodshopVO vo) {
		
		return dao.insertFoodshop(vo);
	}
	
	@Override
	public List<FoodshopVO> fnamesearch(String fname){
		return dao.fnamesearch(fname);
	}
	
	@Override
	public List<FoodshopVO> foodstylesearch(String foodstyle){
		return dao.foodstylesearch(foodstyle);
	}
	
	@Override
	public List<FoodshopVO> discountsearch(String discount) {
		return dao.discountsearch(discount);
	}

	@Override
	public List<FoodshopVO> locsearch(String loc) {
		return dao.locsearch(loc);
	}
	
	public List<FoodshopVO> showfoodshop(String fname){
		
		return dao.showfoodshop(fname);
	}
	
}