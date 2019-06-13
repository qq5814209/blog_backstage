package com.me.mapper;

import com.me.pojo.VipInfo;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 17:56
 */
public interface VipInfoMapper {
    /**
     * 查询所有Vip套餐
     * @return
     */
    List<VipInfo> selectVipInfo();

    /**
     * 修改页根据vip_id回显
     * @param vip_id
     * @return
     */
    VipInfo getVipInfoById(int vip_id);

    /**
     * 修改页根据vip_id修改套餐
     * @param vipInfo
     * @return
     */
    int updateVipInfoById(VipInfo vipInfo);

    /**
     * 根据vip_id删除套餐
     * @param vip_id
     * @return
     */
    int deleteVipInfoById(int vip_id);

    /**
     * 添加vip套餐
     * @param vipInfo
     * @return
     */
    int addVipInfo(VipInfo vipInfo);
}
