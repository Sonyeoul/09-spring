package com.section01.subsection02.constructor;

import com.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.section01");
        BookService bookService = context.getBean(BookService.class);

        List<BookDTO> bookList = bookService.selectAllBooks();
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }
}
