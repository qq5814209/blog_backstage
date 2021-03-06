package com.me.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.me.pojo.CbiInfo;
import com.me.service.CbiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 20:19
 */
@Controller
public class CbiInfoController {
    @Autowired
    CbiInfoService cbiInfoService;

    /**
     * 查询所有C币套餐
     * @return
     */
    @ResponseBody
    @RequestMapping("selectCbiInfo")
    public Object selectCbiInfo(@RequestBody CbiInfo cbiInfo) {
        PageHelper.startPage(cbiInfo.getCurrentPage(), cbiInfo.getPageSize());
        List<CbiInfo> cbiInfos = cbiInfoService.selectCbiInfo();
        PageInfo<CbiInfo> cbiInfoPageInfo = new PageInfo<CbiInfo>(cbiInfos);
        return cbiInfoPageInfo;
    }

    /**
     * 修改页根据cbi_id回显
     * @param cbi_id
     * @return
     */
    @ResponseBody
    @RequestMapping("getCbiInfoById")
    public Object getVipInfoById(@RequestParam int cbi_id){
        return cbiInfoService.getCbiInfoById(cbi_id);
    }

    /**
     * 修改页根据cbi_id修改套餐
     * @return
     */
    @ResponseBody
    @RequestMapping("updateCbiInfoById")
    public Object updateComment(@RequestBody CbiInfo cbiInfo){
        int i = cbiInfoService.updateCbiInfoById(cbiInfo);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 根据cbi_id删除套餐
     * @param cbi_id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteCbiInfoById")
    public Object deleteCbiInfoById(@RequestParam int cbi_id){
        int i = cbiInfoService.deleteCbiInfoById(cbi_id);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 添加C币套餐
     * @param cbiInfo
     * @return
     */
    @ResponseBody
    @RequestMapping("addCbiInfo")
    public Object addCbiInfo(@RequestBody  CbiInfo cbiInfo){
        int i =cbiInfoService.addCbiInfo(cbiInfo);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
}
