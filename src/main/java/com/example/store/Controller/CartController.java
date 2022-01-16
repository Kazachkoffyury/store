package com.example.store.Controller;

import com.example.store.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class CartController {
    private CartService cartService;


    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/add")
    public void addItem(@RequestParam List<Integer> items) {
          cartService.addItem(items);

    }

    @GetMapping("/get")
    public String getItem() {
        return cartService.getItems();

    }
}
