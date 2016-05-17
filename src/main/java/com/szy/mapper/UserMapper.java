package com.szy.mapper;

import com.szy.po.User;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Created by szy on 2016/5/14.
 */

@Repository
public interface UserMapper {

    public List<User> findUsers() throws Exception;

}
