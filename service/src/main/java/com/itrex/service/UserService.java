package com.itrex.service;

import com.itrex.dao.UserDao;
import com.itrex.model.User;

import java.util.List;

public class UserService {

    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
