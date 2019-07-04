package com.study.demo;

import com.alibaba.fastjson.JSON;
import com.study.demo.config.HelloSender;
import com.study.demo.demo.User;
import com.study.demo.domain.Contact;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
	private HelloSender helloSender;

	@Test
	public void contextLoads() {
	}

	/**
	 * redis测试String类型
	 */
	@Test
	public void testString()  {
		redisTemplate.opsForValue().set("neo", "ityouknow");
		Assert.assertEquals("ityouknow", redisTemplate.opsForValue().get("neo"));
		System.out.println("111");
	}

	/**
	 * redis测试pojo类型
	 */
	@Test
	public void testObj(){
		User user = new User("1","1","1");
		User user2 = new User("2","2","2");
		ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
		valueOperations.set("token:1",JSON.toJSONString(user));
		valueOperations.set("token:2",JSON.toJSONString(user2));
		valueOperations.set("token:3",user2);

	}

	/**
	 * 测试redis的失效时间
	 */
	@Test
	public void testExpire() throws InterruptedException {

		User user = new User("1","1","1");

		//设置redis中数据的过期时间
		redisTemplate.opsForValue().set("expire",user,50,TimeUnit.SECONDS);

	//	Thread.sleep(1000);

		//删除redis中的key
	//	redisTemplate.delete("expire");

		//hasKey判断key是否存在
		boolean flag = redisTemplate.hasKey("expire");

		if(flag){
			System.out.println("key还能使用");
		}else {
			System.out.println("key已经失效");
		}

	}

	/**
	 * 测试redis中的hash
	 */
	@Test
	public void testHash(){

		HashOperations<String,Object,Object> hashOperations = redisTemplate.opsForHash();

		hashOperations.put("hash","you","you");
		hashOperations.put("hash","you1","you");
		hashOperations.put("hash1","you","you");
		String value = (String)hashOperations.get("hash", "you");
		System.out.println("value:"+value);

	}




	@Test
	public void test123(){
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("1540115240@qq.com");
		simpleMailMessage.setTo("1540115240@qq.com");
		simpleMailMessage.setSubject("主题：简单邮件");
		simpleMailMessage.setText("测试邮件");
		javaMailSender.send(simpleMailMessage);

	}


	/*@Test
	public void testRabitmq(){
		helloSender.sender();
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/




	/*@Test
	public void testRabitmqUser(){
		Contact contact = new Contact();
		contact.setId("123");
		contact.setUname("123");

		helloSender.sendUser(contact);
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/

    @Test
    public void testRabitmqUser1() throws InterruptedException {
       // helloSender.send1();
		helloSender.send3();

        Thread.sleep(1000l);

    }
























}
