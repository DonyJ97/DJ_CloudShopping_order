package com.order.form;

import lombok.Data;
import javax.validation.constraints.NotEmpty;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 0:26 2020/1/3
 * @ Description：post信息格式
 * @ Modified By：
 * @Version: $
 */
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "手机必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "买家openid必填")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;

}
