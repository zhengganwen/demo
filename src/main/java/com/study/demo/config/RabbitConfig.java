package com.study.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    final static String message ="topic.message";
    final static String messages ="topic.messages";

/*

    @Bean
    public Queue queue(){

        return new Queue("hello");
    }

    @Bean
    public Queue queue1(){

        return new Queue("contact");
    }
*/


    @Bean
    public Queue message(){

        return new Queue(RabbitConfig.message);
    }

    @Bean
    public Queue messages(){

        return new Queue(RabbitConfig.messages);
    }



    @Bean
    TopicExchange exchange(){

        return new TopicExchange("exchange");
    }

    /**
     * 匹配top.message 的消息队列
     * @param message
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue message ,TopicExchange exchange){

        return BindingBuilder.bind(message).to(exchange).with("topic.message");
    }


    /**
     * 匹配top.  的所有消息队列
     * @param messages
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessages(Queue messages ,TopicExchange exchange){

        return BindingBuilder.bind(messages).to(exchange).with("topic.#");
    }

    @Bean
    public Queue aQueue(){

      return   new Queue("fanout.A");
    }

    @Bean
    public Queue bQueue(){

        return   new Queue("fanout.B");
    }

    @Bean
    public Queue cQueue(){

        return   new Queue("fanout.C");
    }


    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingExchangA(Queue aQueue,FanoutExchange fanoutExchange){

        return BindingBuilder.bind(aQueue).to(fanoutExchange);

    }

    @Bean
    Binding bindingExchangB(Queue bQueue,FanoutExchange fanoutExchange){

        return BindingBuilder.bind(bQueue).to(fanoutExchange);

    }

    @Bean
    Binding bindingExchangC(Queue cQueue,FanoutExchange fanoutExchange){

        return BindingBuilder.bind(cQueue).to(fanoutExchange);

    }







}
