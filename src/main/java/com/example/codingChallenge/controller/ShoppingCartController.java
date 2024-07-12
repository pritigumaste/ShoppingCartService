package com.example.codingChallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.codingChallenge.model.CartManagement;
import com.example.codingChallenge.service.ShoppingCartService;
@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
	
	   @Autowired
	    private ShoppingCartService shoppingCartService;

	    @PostMapping("/addItems")
	    public void addItem(@RequestBody CartManagement item) {
	        shoppingCartService.addItem(item);
	    }

	    @GetMapping("/viewItems")
	    public List<CartManagement> getItems() {
	        return shoppingCartService.getItems();
	    }

}
