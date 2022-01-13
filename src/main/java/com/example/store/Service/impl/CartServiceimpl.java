package com.example.store.Service.impl;

import com.example.store.Data.Cart;
import com.example.store.Service.CartService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class CartServiceimpl implements CartService {
    private final Cart cart;


    public CartServiceimpl(Cart cart) {

        this.cart = cart;
        System.out.println("корзина создана успешно");
    }


    @Override
    public void addItem(List<Integer> items) {
        for (Integer item : items) {
            cart.addItems(item);

        }
    }

    @Override
    public String getItems() {
        return cart.toString();
    }
}
