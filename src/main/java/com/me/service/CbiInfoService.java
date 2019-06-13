package com.me.service;

import com.me.pojo.CbiInfo;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 20:20
 */
public interface CbiInfoService {
    /**
     * 查询所有C币套餐
     * @return
     */
    List<CbiInfo> selectCbiInfo();

    /**
     * 修改页根据cbi_id回显
     * @param cbi_id
     * @return
     */
    Object getCbiInfoById(int cbi_id);

    /**
     *修改页根据cbi_id修改套餐
     * @param cbiInfo
     * @return
     */
    int updateCbiInfoById(CbiInfo cbiInfo);

    /**
     *根据cbi_id删除套餐
     * @param cbi_id
     * @return
     */
    int deleteCbiInfoById(int cbi_id);

    /**
     * 添加C币套餐
     * @param cbiInfo
     * @return
     */
    int addCbiInfo(CbiInfo cbiInfo);
}
