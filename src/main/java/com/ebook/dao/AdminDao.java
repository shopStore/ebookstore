package com.ebook.dao;

import com.ebook.model.Admin;

import java.util.List;

public interface AdminDao {
    int deletByPrimaryKey(int id);

    int insert(Admin record);

    Admin selectByPrimaryKey(int id);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
}
