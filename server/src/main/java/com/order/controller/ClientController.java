package com.order.controller;

import com.order.client.ProductClient;
import com.order.dataobject.Product_info;
import com.order.dto.CartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 10:40 2020/1/9
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@RestController
@Slf4j
public class ClientController {
    @Autowired
    private ProductClient productClient;
    @GetMapping("/getProductMsg")
    public String getProductMsg(){
        String response = productClient.productMsg();
        log.info("response={}",response);
        return response;
    }
    @GetMapping("/getProductList")
    public String getProductList(){
        List<Product_info> productInfoList =  productClient.listForOrder(Arrays.asList("157811321161313248"));
        log.info("response={}",productInfoList);
        return "ok";
    }
    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock(){
        productClient.decreaseStock(Arrays.asList(new CartDTO("157811321161313248",5)));
        return "okk";
    }

}
