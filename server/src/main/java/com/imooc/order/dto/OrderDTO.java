package com.imooc.order.dto;

import com.imooc.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 0:03 2020/1/3
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Data
public class OrderDTO {
    /** 订单id **/
    private String orderId;
    /** 买家名字 **/
    private String buyerName;
    /** 买家电话 **/
    private String buyerPhone;
    /** 买家地址 **/
    private String buyerAddress;
    /** 买家微信openid **/
    private String buyerOpenid;
    /** 订单总金额 **/
    private BigDecimal orderAmount;
    /** 订单状态，默认为0 新下单 **/
    private Integer orderStatus;
    /** 支付状态，默认为0 未支付 **/
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}
