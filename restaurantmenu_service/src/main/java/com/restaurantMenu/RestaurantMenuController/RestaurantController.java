package com.restaurantMenu.RestaurantMenuController;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantMenu.entity.RestaurantMenu;
import com.restaurantMenu.service.RestaurantMenuService;


@RestController
@RequestMapping("/restaurantsmenu")
public class RestaurantController {

	@Autowired
	private RestaurantMenuService restaurantmenuService;

	@PostMapping("/restaurantsmenu")
	public RestaurantMenu createRestaurantMenu(@RequestBody RestaurantMenu restaurantmenu) {
		return restaurantmenuService.createRestaurantMenu(restaurantmenu);
	}
	
	 @GetMapping("/restaurants/{restaurantId}") 
	 public Collection<RestaurantMenu> fetchRestaurantMenuList(@PathVariable ("restaurantId") Long restauranId) throws Exception { 
		 return restaurantmenuService.fetchRestaurantMenuList(restauranId);
	  
	 }
}