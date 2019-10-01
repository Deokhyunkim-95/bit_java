package service;

import java.util.List;

import vo.FoodshopVO;

public interface FoodShopService {
	int addFoodshop(FoodshopVO vo);
	public List<FoodshopVO> fnamesearch(String fname);
	public List<FoodshopVO> foodstylesearch(String foodstyle);
	public List<FoodshopVO> discountsearch(String discount);
	public List<FoodshopVO> locsearch(String loc);
	public List<FoodshopVO> showfoodshop(String fname);
}