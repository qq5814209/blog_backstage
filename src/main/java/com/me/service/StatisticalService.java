package com.me.service;

import com.me.vo.StatisticalVo;

public interface StatisticalService {

    /**
     * 获取前几天，每天博客的发表数
     * @param day
     * @return
     */
    StatisticalVo getPublishes(int day);

    /**
     * 获取前几天，每天的阅读量
     * @param day
     * @return
     */
    StatisticalVo getReadingQuantity(int day);
}
