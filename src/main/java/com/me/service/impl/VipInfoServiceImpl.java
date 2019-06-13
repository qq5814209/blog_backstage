package com.me.service.impl;

import com.me.mapper.VipInfoMapper;
import com.me.pojo.VipInfo;
import com.me.service.VipInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 17:46
 */
@Service
public class VipInfoServiceImpl implements VipInfoService {

    @Autowired
    VipInfoMapper vipInfoMapper;
    /**
     * 查询所有Vip套餐
     * @return
     */
    public List<VipInfo> selectVipInfo() {
        return vipInfoMapper.selectVipInfo();
    }

    /**
     * 修改页根据vip_id回显
     * @param vip_id
     * @return
     */
    public Object getVipInfoById(int vip_id) {
        return vipInfoMapper.getVipInfoById(vip_id);
    }

    /**
     * 修改页根据vip_id修改套餐
     * @param vipInfo
     * @return
     */
    public int updateVipInfoById(VipInfo vipInfo) {
        return vipInfoMapper.updateVipInfoById(vipInfo);
    }

    /**
     * 根据vip_id删除套餐
     * @param vip_id
     * @return
     */
    public int deleteVipInfoById(int vip_id) {
        return vipInfoMapper.deleteVipInfoById(vip_id);
    }

    /**
     * 添加Vip套餐
     * @param vipInfo
     * @return
     */
    public int addVipInfo(VipInfo vipInfo) {
        return vipInfoMapper.addVipInfo(vipInfo);
    }
}
