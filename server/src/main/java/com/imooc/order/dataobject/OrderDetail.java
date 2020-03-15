package com.imooc.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 23:07 2020/1/2
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Data
@Entity
public class OrderDetail {
    @Id
    private String detailId;
    /** 订单id **/
    private String orderId;
    /** 商品id **/
    private String productId;
    /** 商品名字 **/
    private String productName;
    /** 当前价格 **/
    private BigDecimal productPrice;
    /** 数量 **/
    private Integer productQuantity;
    /** 小图 **/
    private String productIcon;

    private Date createTime;

    private Date updateTime;
}
