package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 23:22 2020/1/2
 * @ Description：OrderMaster DAO
 * @ Modified By：
 * @Version: $
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    
}
