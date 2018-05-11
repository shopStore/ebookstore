package com.ebook.service.serviceImpl;

import com.ebook.dao.OrderMapper;
import com.ebook.model.Order;
import com.ebook.service.OrderService;
import com.ebook.utils.DBUtil;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    private static final OrderMapper orderMapper = (OrderMapper) DBUtil.getMapperInstance(OrderMapper.class);

    @Override
    public List<Order> getAllOrders() {
        List<Order> orders = orderMapper.selectAll();
        return orders;
    }
}
