package com.imooc.order.enums;

import lombok.Getter;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 23:41 2020/1/2
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }
}
