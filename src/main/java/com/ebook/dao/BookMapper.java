package com.ebook.dao;

import com.ebook.model.Book;

import java.util.List;

public interface BookMapper {
    int deletByPrimaryKey(int id);

    int insert(Book record);

    Book selectByPrimaryKey(int id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}
