//package com.example.codingChallenge.service;
//
//import com.example.codingChallenge.model.CartManagement;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class ShoppingCartService {
//    private List<CartManagement> cartManagement = new ArrayList<>();
//
//    public void addItem(CartManagement item) {
//    	cartManagement.add(item);
//    }
//
//    public List<CartManagement> getItems() {
//        return cartManagement;
//    }
//}
package com.example.codingChallenge.service;

import com.example.codingChallenge.model.CartManagement;
import com.example.codingChallenge.repository.CartManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private CartManagementRepository cartManagementRepository;

    public void addItem(CartManagement item) {
        cartManagementRepository.save(item);
    }

    public List<CartManagement> getItems() {
        return cartManagementRepository.findAll();
    }
}
