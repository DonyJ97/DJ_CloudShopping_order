package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 14:42 2020/2/26
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
//@Slf4j
//@Component
//public class MqReveiver {
//    //绑定队列接收消息
//    //@RabbitListener(queues = "myQueue")
//    //自动创建队列
//    //@RabbitListener(queuesToDeclare = @Queue("myQueue"))
//    //实现queue和exchange的绑定，而且支持key分组创建queue。
//    @RabbitListener(bindings = @QueueBinding(
//            exchange = @Exchange("myOrder"),
//            key = "fruit",
//            value =  @Queue("fruitOrder")
//    ))
//    public void process(String message){
//        log.info("MqReveiver: {}",message);
//    }
//}
