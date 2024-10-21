package com.section02.javaconfig;

import com.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02")
public class ContextConfiguration {

    @Bean(name="member")
    public MemberDTO getMember() {
        return new MemberDTO(1,"user02","홍홍","pass");
    }
}
