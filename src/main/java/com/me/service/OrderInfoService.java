package com.me.service;

import com.me.pojo.Order;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 22:27
 */
public interface OrderInfoService {
    /**
     * 查询所有已完成订单
     * @return
     */
    List<Order> selectCompletedOrderInfo();

    /**
     *查询所有未完成订单
     * @return
     */
    List<Order> selectBacklogOrderInfo();

    /**
     * 修改页根据order_id回显
     * @param order_id
     * @return
     */
    Object getOrderById(int order_id);

    /**
     * 修改页根据order_id修改订单
     * @param order
     * @return
     */
    int updateOrderById(Order order);

    /**
     * 根据order_id删除订单
     * @param order_id
     * @return
     */
    int deleteCompletedOrderById(int order_id);


}
