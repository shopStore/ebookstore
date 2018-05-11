package com.ebook.service.serviceImpl;

import com.ebook.dao.UserMapper;
import com.ebook.model.User;
import com.ebook.service.UserService;
import com.ebook.utils.DBUtil;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static final UserMapper userMapper = (UserMapper) DBUtil.getMapperInstance(UserMapper.class);

    @Override
    public List<User> getAllUser() {
        List<User> users = userMapper.selectAll();
        return users;
    }
}
