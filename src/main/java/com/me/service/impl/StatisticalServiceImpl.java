package com.me.service.impl;

import com.me.mapper.StatisticalMapper;
import com.me.service.StatisticalService;
import com.me.vo.StatisticalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticalServiceImpl implements StatisticalService {

    @Autowired
    StatisticalMapper statisticalMapper;
    int[] days;
    /**
     * 获取前几天，每天博客的发表数
     * @param day
     * @return
     */
    public StatisticalVo getPublishes(int day) {

        days = new int[day];
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }
        StatisticalVo data = statisticalMapper.getPublishes(days);

        return data;
    }

    /**
     * 获取前几天，每天的阅读量
     * @param day
     * @return
     */
    public StatisticalVo getReadingQuantity(int day) {
        days = new int[day];
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }
        StatisticalVo data = statisticalMapper.getReadingQuantity(days);
        return data;
    }
}
