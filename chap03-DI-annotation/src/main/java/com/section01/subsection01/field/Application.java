package com.section01.subsection01.field;

import com.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.section01");
        BookService bookService = context.getBean(BookService.class);

        List<BookDTO> bookDTOList = bookService.selectAllBook();
        for (BookDTO book : bookDTOList) {
            System.out.println(book);
        }
        System.out.println(bookService.selectOneBook(1));
    }
}
