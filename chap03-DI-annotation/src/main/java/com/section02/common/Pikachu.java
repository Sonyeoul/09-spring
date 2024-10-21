package com.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Poketmon{


    @Override
    public void attack(){
        System.out.println("박치기");
    }
}
