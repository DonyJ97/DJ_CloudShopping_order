package com.order.service;

import com.order.dto.OrderDTO;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 0:01 2020/1/3
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public interface OrderService {//建立dto包，为数据传输对象
    /*
    * 创建订单
    * OrderDTO
    * */
    OrderDTO create(OrderDTO orderDTO);
    /*
     * 完结订单(只能卖家来操作)
     * OrderDTO
     * */
    OrderDTO finish(String orderId);
}
