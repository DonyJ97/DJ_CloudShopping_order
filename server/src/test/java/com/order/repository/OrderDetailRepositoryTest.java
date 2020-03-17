package com.order.repository;

import com.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 23:50 2020/1/2
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Test
    public void testsave(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1");
        orderDetail.setOrderId("1");
        orderDetail.setProductId("157811321161313248");
        orderDetail.setProductName("蜜汁鸡翅");
        orderDetail.setProductPrice(new BigDecimal(10.50));
        orderDetail.setProductQuantity(5);
        orderDetail.setProductIcon("//fuss10.elemecdn.com/0/49/65d10ef215d3c770ebb2b5ea962a7jpeg.jpeg");

        OrderDetail cur = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(cur!=null);
    }
}
