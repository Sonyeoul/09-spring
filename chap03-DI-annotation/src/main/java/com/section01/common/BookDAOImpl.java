package com.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
    private Map<Integer,BookDTO> bookList;

    public BookDAOImpl(){
        bookList = new HashMap<>();
        bookList.put(1,new BookDTO(1,555,"박지성","park","출판",new Date()));
    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int seq) {
        return bookList.get(seq);
    }
}
