package com.study.demo.web;


import com.study.demo.domain.Contact;
import com.study.demo.service.ContactService;
import com.study.demo.service.PluginConfigServer;
import com.study.demo.tencent.sms.SmsApi;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:2017.11.6
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Resource
    private ContactService contactService;

    @Autowired
    private RedisTemplate redisTemplate;

    @ApiOperation(value = "获取用户信息",notes = "")
    @PostMapping("/findAll123")
    public List<Contact> finAll() {
        List<Contact> list = contactService.findAll();
        return list;
    }



}
