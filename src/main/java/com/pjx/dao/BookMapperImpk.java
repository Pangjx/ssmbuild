package com.pjx.dao;

import com.pjx.pojo.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookMapperImpk extends SqlSessionDaoSupport implements BookMapper {
    @Override
    public int addBook(Books books) {
        return 0;
    }

    @Override
    public int deleteBookById(int id) {
        return 0;
    }

    @Override
    public int updateBook(Books books) {
        return 0;
    }

    @Override
    public Books queryBookById(int id) {
        return null;
    }

    @Override
    public List<Books> selectAllBook() {
        return null;
    }
}
