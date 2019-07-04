package com.study.demo.web;


import com.alibaba.fastjson.JSON;
import com.study.demo.config.HelloSender;
import com.study.demo.domain.Contact;
import com.study.demo.service.ContactService;
import com.study.demo.service.PluginConfigServer;
import com.study.demo.tencent.sms.SmsApi;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:2017.11.6
 */
@RestController
@RequestMapping("/concat")
public class ContactController {

    private static  final Logger LOGGER = LoggerFactory.getLogger(ContactController.class);
    @Resource
    private ContactService contactService;
    @Resource
    private PluginConfigServer pluginConfigServer;
    @Resource
    private SmsApi smsApi;
    @Autowired
    private HelloSender helloSender;


    @Autowired
    private RedisTemplate redisTemplate;

    @ApiOperation(value = "获取用户信息",notes = "")
    @GetMapping("/findAll")
    public List<Contact> finAll() {
        LOGGER.info("finAll接口查询所有");
        List<Contact> list = contactService.findAll();
        return list;
    }




   /* @PostMapping("/testredis")
    public Contact testRedis() {
       Contact contact = Contact.builder().id("123").uname("张三").uphone("12537").uname("123").userid("123").intime(new Date()).build();

        redisTemplate.opsForValue().set("token:" + 123, JSON.toJSONString(contact));


        //  Object o = redisTemplate.opsForValue().get("token:123");

        return contact;
    }*/

    @GetMapping("/findByPluginId")
    public String findByPluginId() {
     //   PluginConfig txSmsApi = pluginConfigServer.findByPluginId("txSmsApi");
     //   PluginConfig txSmsApi = smsApi.getSmsPlugin();

     //   Map<String, String> attributesMap = txSmsApi.getAttributesMap();

        String apikey =smsApi.test();
                //


        return apikey;
    }

    @GetMapping("/hello")
    @Cacheable(value = "helloCache",key = "#name",condition = "#name.length()<=3")
    public String hello(@RequestParam("name") String name){

        System.out.println("没有走缓存！！");
        return "hello"+name;

    }

    /*@GetMapping("/contactResister")
    public Contact contactResister(){

        List<Contact> list = contactService.findAll();
        helloSender.sendUser(list.get(0));

        return list.get(0);
    }*/







}
