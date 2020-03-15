package com.imooc.order.message;


import org.springframework.stereotype.Component;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 16:11 2020/2/26
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
//@Component
//public class ProductInfoReceiver {
//    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
//    public void process(String message){
//        //message==>ProductInfoOutput
//    }
//    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
//    public void process(String message) {
//        //message => ProductInfoOutput
//        List<ProductInfoOutput> productInfoOutputList = (List<ProductInfoOutput>)JsonUtil.fromJson(message,
//                new TypeReference<List<ProductInfoOutput>>() {});
//        log.info("从队列【{}】接收到消息：{}", "productInfo", productInfoOutputList);
//
//        //存储到redis中
//        for (ProductInfoOutput productInfoOutput : productInfoOutputList) {
//            stringRedisTemplate.opsForValue().set(String.format(PRODUCT_STOCK_TEMPLATE, productInfoOutput.getProductId()),
//                    String.valueOf(productInfoOutput.getProductStock()));
//        }
//    }
//}
