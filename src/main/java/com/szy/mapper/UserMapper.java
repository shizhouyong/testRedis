package com.szy.mapper;

import com.szy.po.User;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * Created by szy on 2016/5/14.
 */

@Component("userMapper")
public interface UserMapper {

    public List<User> findUserList() throws Exception;

}
