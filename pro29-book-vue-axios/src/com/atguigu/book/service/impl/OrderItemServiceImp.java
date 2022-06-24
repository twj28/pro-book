package com.atguigu.book.service.impl;

import com.atguigu.book.dao.OrderItemDAO;
import com.atguigu.book.pojo.OrderBean;
import com.atguigu.book.pojo.OrderItem;
import com.atguigu.book.service.OrderItemService;
import com.atguigu.book.service.OrderService;

import java.util.List;

/**
 * @ClassNmae OrderItemServiceImp
 * @Description TODO
 * @Author twj280
 * @Date 2022/5/18 15:05
 * @Version 1.0
 **/
public class OrderItemServiceImp implements OrderItemService {
    private OrderItemDAO orderItemDAO;
    @Override
    public void addOrderItem(OrderItem orderItem) {
        orderItemDAO.addOrderItem(orderItem);
    }

    @Override
    public List<OrderItem> getOrderItemList(OrderBean orderBean) {
        return orderItemDAO.getOrderItemList(orderBean);
    }

    @Override
    public Integer getBuyCount(OrderBean orderBean) {
        return orderItemDAO.getBuyCount(orderBean);
    }
}
