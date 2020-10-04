package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {
    int addBooks(Books books);
    int deleteBookById(@Param("bookID") int id);
    int updateBook(Books books);
    Books queryBookByID(@Param("bookID") int id);

    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName") String bookName);
}
