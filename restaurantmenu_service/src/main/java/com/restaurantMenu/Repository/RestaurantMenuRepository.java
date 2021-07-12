package com.restaurantMenu.Repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.restaurantMenu.entity.RestaurantMenu;


@Repository
public interface RestaurantMenuRepository extends JpaRepository<RestaurantMenu, Long> {
	
	  @Query(value = "SELECT r FROM RestaurantMenu r where LOWER(r.restaurantId) = LOWER(:restaurantId)")
	  Collection<RestaurantMenu> findMenuList(@Param("restaurantId") Long restaurantId)throws Exception;
	  }
