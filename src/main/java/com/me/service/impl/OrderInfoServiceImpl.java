package com.me.service.impl;

import com.me.mapper.OrderInfoMapper;
import com.me.pojo.Order;
import com.me.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 22:28
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    OrderInfoMapper orderInfoMapper;

    /**
     * 查询所有已完成订单
     * @return
     */
    public List<Order> selectCompletedOrderInfo() {
        return orderInfoMapper.selectCompletedOrderInfo();
    }

    /**
     * 查询所有未完成订单
     * @return
     */
    public List<Order> selectBacklogOrderInfo() {
        return orderInfoMapper.selectBacklogOrderInfo();
    }

    /**
     * 修改页根据order_id回显
     * @param order_id
     * @return
     */
    public Object getOrderById(int order_id) {
        return orderInfoMapper.getOrderById(order_id);
    }

    /**
     * 修改页根据order_id修改订单
     * @param order
     * @return
     */
    public int updateOrderById(Order order) {
        return orderInfoMapper.updateOrderById(order);
    }

    /**
     * 根据order_id删除订单
     * @param order_id
     * @return
     */
    public int deleteCompletedOrderById(int order_id) {
        return orderInfoMapper.deleteCompletedOrderById(order_id);
    }
}
