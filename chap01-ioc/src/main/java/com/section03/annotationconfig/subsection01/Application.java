package com.section03.annotationconfig.subsection01;

import com.common.MemberDAO;
import com.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    /*
     * ComponentScan
     * base Packages 로 설정 된 하위 경로에 특정 어노테이션을 가지고 있는
     * 클래스를 bean 으로 등로갛는 기능이다
     * @Component 어노테이션이 작성된 클래스를 인식하여 bean 으로 등록한다
     * 특수 목적에 따라 @Controller, @Service 등을 사용한다
     * */
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguation.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println(bean);
        }

        MemberDAO memberDAO = context.getBean(MemberDAO.class);

        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insertMember(new MemberDTO(3,"user03","이흥","pass03")));
        System.out.println(memberDAO.selectMember(3));

    }
}
