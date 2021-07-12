package com.restaurantMenu.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantMenu.Repository.RestaurantMenuRepository;
import com.restaurantMenu.entity.RestaurantMenu;

@Service
public class RestaurantMenuServiceImpl implements RestaurantMenuService{
	
	@Autowired
	private RestaurantMenuRepository restaurantmenuRepository;
         


	@Override
	public RestaurantMenu createRestaurantMenu(RestaurantMenu restaurantmenu) {
		return restaurantmenuRepository.save(restaurantmenu);
	}

	  @Override 
	  public Collection<RestaurantMenu> fetchRestaurantMenuList(Long restaurantId) throws Exception { 
		  return restaurantmenuRepository.findMenuList(restaurantId); 
	  }



	

	 
   

}
