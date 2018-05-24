package com.ebook.dao;

import com.ebook.model.Order;

import java.util.List;

public interface OrderMapper {
    int deletByPrimaryKey(int id);

    int insert(Order record);

    Order selectByPrimaryKey(int id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}
