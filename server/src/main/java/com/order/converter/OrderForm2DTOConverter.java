package com.order.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.order.dataobject.OrderDetail;
import com.order.dto.OrderDTO;
import com.order.enums.ResultEnum;
import com.order.exception.OrderException;
import com.order.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 11:35 2020/1/3
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Slf4j
public class OrderForm2DTOConverter {
    public static OrderDTO convert(OrderForm orderForm){
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){}.getType());
        } catch (Exception e){
            log.error("【json转换错误】,string = {}",orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
