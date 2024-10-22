package com.section03.question;

import com.section03.common.Owner;
import com.section03.common.ProductDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {


        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");
        Owner owner = context.getBean("owner",Owner.class);
        ProductDTO bread = context.getBean("bread", ProductDTO.class);
        System.out.println(owner);
        System.out.println(bread);



    }
}