package com.restaurantMenu.service;


import java.util.Collection;
import java.util.List;

import com.restaurantMenu.entity.RestaurantMenu;

public interface RestaurantMenuService {
	  public RestaurantMenu createRestaurantMenu(RestaurantMenu restaurantmenu);
	  
	public Collection<RestaurantMenu> fetchRestaurantMenuList(Long restaurantId) throws Exception;
	

}
