package com.example.store.Data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private List<Integer> items;

    public Cart() {
         this.items = new ArrayList<Integer>();
    }

    public List<Integer> getItems() {
        return items;
    }

    public void addItems( Integer item) {
        items.add(item);
    }
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
