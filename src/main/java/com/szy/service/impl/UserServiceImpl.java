package com.szy.service.impl;

import com.szy.mapper.UserMapper;
import com.szy.po.User;
import com.szy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by szy on 2016/5/14.
 */

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findUserList() throws Exception {
        return userMapper.findUsers();
    }


}
