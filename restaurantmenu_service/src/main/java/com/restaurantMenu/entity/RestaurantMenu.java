package com.restaurantMenu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RestaurantMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long menuId;
    private Long price;
    private String itemName;
    private Long restaurantId;

}
