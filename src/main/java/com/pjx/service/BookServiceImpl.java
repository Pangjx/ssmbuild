package com.pjx.service;

import com.pjx.dao.BookMapper;
import com.pjx.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    //service层调用dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> selectAllBook() {
        return bookMapper.selectAllBook();
    }
}
