package com.example.service;

import com.example.dao.LoginLogDao;
import com.example.dao.UserDao;
import com.example.domain.LoginLog;
import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Administrator
 * @create 2016-09-29-13:48
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginLogDao loginLogDao;

    public List<User> findUsers() {
       return userDao.findUsers();
    }

    @Transactional
    public void login(User user) {
        user.setAge( 1 + user.getAge());
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getId());
        loginLog.setIp("127.0.0.1");
        loginLog.setLoginDate(new Date());
        userDao.updateLoginInfo(user);
//        int a = 1/0;
        loginLogDao.insertLoginLog(loginLog);
    }
}
