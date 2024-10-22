package com.section03.common;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductDAO {
    private final Map<Integer, ProductDTO> productMap;

    public ProductDAO() {
        this.productMap = new HashMap<>();

        productMap.put(1,new ProductDTO("붕어빵",1000));
        productMap.put(2,new ProductDTO("딸기우유",1500));
    }
}
