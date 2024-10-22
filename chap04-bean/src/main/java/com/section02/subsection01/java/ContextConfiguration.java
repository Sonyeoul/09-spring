package com.section02.subsection01.java;


import com.common.Beverage;
import com.common.Bread;
import com.common.Product;
import com.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {
    @Bean
    public Product carpBread(){
        return new Bread("붕어빵",1000,new Date());
    }
    @Bean
    public Product milk(){
        return new Beverage("딸기우유",1500,500);
    }
    @Bean
    public Product water(){
        return new Beverage("물",1000,500);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
    public Owner owner(){
        return new Owner();
    }
}
