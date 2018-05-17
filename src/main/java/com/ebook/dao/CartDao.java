package com.ebook.dao;

import com.ebook.model.Cart;

import java.util.List;

public interface CartDao {
    int deletByPrimaryKey(int id);

    int insert(Cart record);

    Cart selectByPrimaryKey(int id);

    List<Cart> selectAll();

    int updateByPrimaryKey(Cart record);
}
