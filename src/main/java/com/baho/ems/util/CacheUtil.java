package com.baho.ems.util;

import com.baho.ems.dao.entity.db3.special.BpmUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CacheUtil {

    /*public final static String USER = "user";
    public static CacheUtil cacheUtil;
    @Autowired
    public CacheManager cacheManager;

    public void putUser(String sessionId, BpmUser user) throws Exception {
        if (StringUtils.isBlank(sessionId)) {
            throw new Exception("sessionId is null");
        }
        Cache cache = cacheManager.getCache(USER);

        cache.put(sessionId, user);
    }

    public BpmUser getUser(String sessionId) throws Exception {
        if (StringUtils.isBlank(sessionId)) {
            throw new Exception("sessionId is null");
        }
        Cache cache = cacheManager.getCache(USER);
        return cache.get(sessionId, BpmUser.class);
    }

    public void delUser(String sessionId) throws Exception {
        if (StringUtils.isBlank(sessionId)) {
            throw new Exception("sessionId is null");
        }
        Cache cache = cacheManager.getCache(USER);
        cache.put(sessionId, null);
    }

    public CacheUtil() {
    }

    @PostConstruct
    public void init() {
        cacheUtil = this;
        cacheUtil.cacheManager = this.cacheManager;
    }*/

}
