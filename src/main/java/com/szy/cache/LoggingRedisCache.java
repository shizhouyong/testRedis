package com.szy.cache;

import org.apache.ibatis.cache.decorators.LoggingCache;

/**
 * Created by szy on 2016/5/17.
 */
public class LoggingRedisCache extends LoggingCache {

    public LoggingRedisCache(String id) {
        super(new RedisCache(id));
    }

}