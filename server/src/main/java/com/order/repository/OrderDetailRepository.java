package com.order.repository;

import com.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 23:23 2020/1/2
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);
}
