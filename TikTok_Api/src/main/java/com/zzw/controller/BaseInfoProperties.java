package com.zzw.controller;

import com.zzw.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseInfoProperties {
    @Autowired
    public RedisOperator redis;

    public static final String MOBILE_SMSCODE = "mobile:smscode";
    public static final String REDIS_USER_TOKEN = "redis_user_token";
    public static final String REDIS_USER_INFO = "redis_user_info";


}
