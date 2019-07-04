package com.study.demo.config;

import com.study.demo.domain.Contact;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class HelloReciver {

    @Autowired
    private JavaMailSender javaMailSender;


    /*@RabbitListener(queues = "hello")
    @RabbitHandler
    public void reciever(String hello){
        System.out.println("helo="+hello);
    }



    @RabbitListener(queues = "contact")
    @RabbitHandler
    public void recieverUser(Contact contact){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("1540115240@qq.com");
        simpleMailMessage.setTo("1540115240@qq.com");
        simpleMailMessage.setSubject("主题：简单邮件");
        simpleMailMessage.setText("测试邮件");
        javaMailSender.send(simpleMailMessage);

        System.out.println("发送的对象是"+contact);
    }*/



    @RabbitListener(queues = "topic.message")
    @RabbitHandler
    public void reciever1(String  message){


        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("1540115240@qq.com");
        simpleMailMessage.setTo("1540115240@qq.com");
        simpleMailMessage.setSubject("top.message");
        simpleMailMessage.setText("测试邮件1");
        javaMailSender.send(simpleMailMessage);


        System.out.println("发送的对象是top.message"+message);
    }



    @RabbitListener(queues = "topic.messages")
    @RabbitHandler
    public void reciever2(String  message){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("1540115240@qq.com");
        simpleMailMessage.setTo("1540115240@qq.com");
        simpleMailMessage.setSubject("top.messages");
        simpleMailMessage.setText("测试邮件2");
        javaMailSender.send(simpleMailMessage);
        System.out.println("接收top.messages"+message);
    }


    @RabbitListener(queues = "fanout.A")
    @RabbitHandler
    public void reciever3(String  message){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("1540115240@qq.com");
        simpleMailMessage.setTo("1540115240@qq.com");
        simpleMailMessage.setSubject("1");
        simpleMailMessage.setText("1");
        javaMailSender.send(simpleMailMessage);
        System.out.println("接收top.messages"+message);
    }
    @RabbitListener(queues = "fanout.B")
    @RabbitHandler
    public void reciever4(String  message){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("1540115240@qq.com");
        simpleMailMessage.setTo("1540115240@qq.com");
        simpleMailMessage.setSubject("2");
        simpleMailMessage.setText("2");
        javaMailSender.send(simpleMailMessage);
        System.out.println("接收top.messages"+message);
    }

    @RabbitListener(queues = "fanout.C")
    @RabbitHandler
    public void reciever5(String  message){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("1540115240@qq.com");
        simpleMailMessage.setTo("1540115240@qq.com");
        simpleMailMessage.setSubject("3");
        simpleMailMessage.setText("3");
        javaMailSender.send(simpleMailMessage);
        System.out.println("接收top.messages"+message);
    }





}
