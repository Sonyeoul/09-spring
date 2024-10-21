package com.section01.subsection03.setter;


import com.section01.common.BookDAO;
import com.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceSetter")
public class BookService {
    private BookDAO bookDAO;

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }


    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }
    public BookDTO selectOneBook(int seq){
        return bookDAO.selectOneBook(seq);
    }
}
