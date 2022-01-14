package com.example.store.Config;

import com.example.store.Data.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Configuration
 class ConfigurationApp {
@Bean
@SessionScope
public Cart createCart() {
    return new Cart();

}


}


