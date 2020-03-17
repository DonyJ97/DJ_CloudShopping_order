package com.order.exception;

import com.order.enums.ResultEnum;
import lombok.Data;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 11:26 2020/1/3
 * @ Description：订单异常
 * @ Modified By：
 * @Version: $
 */
@Data
public class OrderException extends RuntimeException{
    private Integer code;
    public OrderException(Integer code,String msg){
        this.code = code;
    }
    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
