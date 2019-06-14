package com.me.controller;

import com.me.service.StatisticalService;
import com.me.vo.StatisticalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 获取统计数据用controller
 */
@Controller
public class StatisticalController {

    @Autowired
    StatisticalService statisticalService;

    /**
     * 获取前几天，每天博客的发表数
     * @param day
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getPublishes", method = RequestMethod.GET)
    public Object getPublishes (int day){
        StatisticalVo publishes = statisticalService.getPublishes(day);

        return publishes;
    }

    /**
     * 获取前几天，每天的阅读量
     * @param day
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getReadingQuantity", method = RequestMethod.GET)
    public Object getReadingQuantity(int day){
        StatisticalVo readingQuantity = statisticalService.getReadingQuantity(day);
        return readingQuantity;
    }

}
