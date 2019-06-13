package com.me.controller;

import com.me.pojo.Order;
import com.me.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 22:26
 */
@Controller
public class OrderInfoController {
    @Autowired
    OrderInfoService orderInfoService;

    /**
     * 查询所有已完成订单
     * @return
     */
    @ResponseBody
    @RequestMapping("selectCompletedOrderInfo")
    public Object selectCompletedOrderInfo() {
        List<Order> orderList = orderInfoService.selectCompletedOrderInfo();
        return orderList;
    }
    /**
     * 查询所有未完成订单
     * @return
     */
    @ResponseBody
    @RequestMapping("selectBacklogOrderInfo")
    public Object selectBacklogOrderInfo() {
        List<Order> orderList = orderInfoService.selectBacklogOrderInfo();
        return orderList;
    }

    /**
     * 修改页根据order_id回显
     * @param order_id
     * @return
     */
    @ResponseBody
    @RequestMapping("getOrderById")
    public Object getOrderById(@RequestParam int order_id){
        return orderInfoService.getOrderById(order_id);
    }

    /**
     * 修改页根据order_id修改订单
     * @return
     */
    @ResponseBody
    @RequestMapping("updateOrderById")
    public Object updateOrderById(@RequestBody Order order){
        int i = orderInfoService.updateOrderById(order);
        System.out.println(i);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 根据order_id删除订单
     * @param order_id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteCompletedOrderById")
    public Object deleteCompletedOrderById(@RequestParam int order_id){
        int i = orderInfoService.deleteCompletedOrderById(order_id);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }

}
