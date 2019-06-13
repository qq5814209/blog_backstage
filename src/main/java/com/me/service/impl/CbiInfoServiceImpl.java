package com.me.service.impl;

import com.me.mapper.CbiInfoMapper;
import com.me.pojo.CbiInfo;
import com.me.service.CbiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 20:21
 */
@Service
public class CbiInfoServiceImpl implements CbiInfoService {

    @Autowired
    CbiInfoMapper cbiInfoMapper;

    /**
     * 查询所有C币套餐
     * @return
     */
    public List<CbiInfo> selectCbiInfo() {
        return cbiInfoMapper.selectCbiInfo();
    }

    /**
     * 修改页根据cbi_id回显
     * @param cbi_id
     * @return
     */
    public Object getCbiInfoById(int cbi_id) {
        return cbiInfoMapper.getCbiInfoById(cbi_id);
    }

    /**
     * 修改页根据cbi_id修改套餐
     * @param cbiInfo
     * @return
     */
    public int updateCbiInfoById(CbiInfo cbiInfo) {
        return cbiInfoMapper.updateCbiInfoById(cbiInfo);
    }

    /**
     * 根据cbi_id删除套餐
     * @param cbi_id
     * @return
     */
    public int deleteCbiInfoById(int cbi_id) {
        return cbiInfoMapper.deleteCbiInfoById(cbi_id);
    }

    /**
     * 添加C币套餐
     * @param cbiInfo
     * @return
     */
    public int addCbiInfo(CbiInfo cbiInfo) {
        return cbiInfoMapper.addCbiInfo(cbiInfo);
    }
}
