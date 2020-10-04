package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBooks(Books books);
    int deleteBookById(int id);
    int updateBook(Books books);
    Books queryBookByID(int id);

    List<Books> queryAllBook();
    Books queryBookByName(String bookName);
}
