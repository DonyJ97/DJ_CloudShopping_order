package com.order.enums;

import lombok.Getter;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 11:30 2020/1/3
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Getter
public enum  ResultEnum {
    PARAM_ERROR(1,"参数错误"),
    CAR_EMPTY(2,"购物车为空"),
    ORDER_NOT_EXIST(3, "订单不存在"),
    ORDER_STATUS_ERROR(4, "订单状态错误"),
    ORDER_DETAIL_NOT_EXIST(5, "订单详情不存在"),
    ;
    private Integer code;
    private String message;
    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }
}
