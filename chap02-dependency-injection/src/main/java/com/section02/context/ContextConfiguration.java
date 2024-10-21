package com.section02.context;

import com.common.Account;
import com.common.MemberDTO;
import com.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20,"033*3332*222");
    }
    @Bean
    public MemberDTO memberGenerator(){
        MemberDTO member = new MemberDTO(
                30,"홍홍3","010343413485","rmrmrmr@naver.com",accountGenerator());
        return member;
    }
}
