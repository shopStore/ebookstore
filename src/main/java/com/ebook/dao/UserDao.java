package com.ebook.dao;

import com.ebook.model.User;

import java.util.List;

public interface UserDao {
    int deletByPrimaryKey(int id);

    int insert(User record);

    User selectByPrimaryKey(int id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

}
