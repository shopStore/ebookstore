package com.ebook.dao;

import com.ebook.model.Book;

import java.util.List;

public interface BookDao {
    int deletByPrimaryKey(int id);

    int insert(Book record);

    Book selectByPrimaryKey(int id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}
