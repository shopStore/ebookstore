package com.ebook.service.serviceImpl;

import com.ebook.dao.UserDao;
import com.ebook.model.User;
import com.ebook.service.UserService;
import com.ebook.utils.DBUtil;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static final UserDao USER_DAO = (UserDao) DBUtil.getMapperInstance(UserDao.class);

    @Override
    public List<User> getAllUser() {
        List<User> users = USER_DAO.selectAll();
        return users;
    }
}
