package com.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Squirtle implements Poketmon{

    @Override
    public void attack() {
        System.out.println("구르기");
    }
}
