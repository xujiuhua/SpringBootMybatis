package com.example.dao;

import com.example.domain.User;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua[xujiuhuamoney@163.com]
 * @create 2016-09-29-13:47
 */
public interface UserDao {
    List<User> findUsers();

    void updateLoginInfo(User user);
}
