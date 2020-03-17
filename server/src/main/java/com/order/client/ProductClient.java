package com.order.client;

import com.order.dataobject.Product_info;
import com.order.dto.CartDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 10:27 2020/1/16
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@FeignClient(name = "product")
public interface ProductClient {
    @GetMapping("/msg")
    String productMsg();
    @PostMapping("/product/listForOrder")
    List<Product_info> listForOrder(@RequestBody List<String> productIdList);
    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<CartDTO> cartDTOList);
}
