package com.szy.service;

import com.szy.po.User;

import java.util.List;


/**
 * Created by szy on 2016/5/14.
 */
public interface UserService {

    public List<User> findUserList() throws Exception;
}
