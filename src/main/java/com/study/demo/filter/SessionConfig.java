package com.study.demo.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-13 14:56
 * @Description 配置redis实现分布式session共享
 */
@Configuration
//配置分布式session失效时间
@EnableRedisHttpSession(maxInactiveIntervalInSeconds =60*60 )
public class SessionConfig {



}
