package com.order.VO;

import lombok.Data;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 12:01 2020/1/3
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Data
public class ResultVO<T> {
    private Integer code;

    private String message;

    private T data;
}
