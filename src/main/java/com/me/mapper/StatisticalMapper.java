package com.me.mapper;

import com.me.vo.StatisticalVo;

public interface StatisticalMapper {
    /**
     * 获取前几天，每天博客的发表数
     * @param days
     * @return
     */
    StatisticalVo getPublishes(int[] days);

    /**
     * 获取前几天，每天的阅读量
     * @param days
     * @return
     */
    StatisticalVo getReadingQuantity(int[] days);
}
