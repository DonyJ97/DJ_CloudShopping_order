package com.order.enums;

import lombok.Getter;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 23:35 2020/1/2
 * @ Description：订单状态码
 * @ Modified By：
 * @Version: $
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }
}
