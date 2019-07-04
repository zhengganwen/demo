package com.study.demo.config;

import com.study.demo.domain.Contact;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

   /* public void sender(){
        String hello = "helloWord";
        amqpTemplate.convertAndSend("hello",hello);
    }


    public  void sendUser(Contact contact){
        amqpTemplate.convertAndSend("contact",contact);
    }*/


    public void send1(){
        String s = "不要哭了吧";
        amqpTemplate.convertAndSend("fanoutExchange","",s);

    }


    public void send2(){
        String s = "该哭的人是我吧";
        amqpTemplate.convertAndSend("exchange","topic.messages",s);

    }

    public void send3(){
        String s = "123456";
        amqpTemplate.convertAndSend("fanoutExchange","",s);

    }
}
