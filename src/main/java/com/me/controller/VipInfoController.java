package com.me.controller;

import com.me.pojo.VipInfo;
import com.me.service.VipInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Lee
 * @date 2019-06-13 17:44
 */
@Controller
public class VipInfoController {

    @Autowired
    VipInfoService vipInfoService;

    /**
     * 查询所有Vip套餐
     * @return
     */
    @ResponseBody
    @RequestMapping("selectVipInfo")
    public Object selectVipInfo() {
        List<VipInfo> vipInfos = vipInfoService.selectVipInfo();
        return vipInfos;
    }

    /**
     * 修改页根据vip_id回显
     * @param vip_id
     * @return
     */
    @ResponseBody
    @RequestMapping("getVipInfoById")
    public Object getVipInfoById(@RequestParam int vip_id){
        return vipInfoService.getVipInfoById(vip_id);
    }

    /**
     * 修改页根据vip_id修改套餐
     * @return
     */
    @ResponseBody
    @RequestMapping("updateVipInfoById")
    public Object updateComment(@RequestBody VipInfo vipInfo){
        int i = vipInfoService.updateVipInfoById(vipInfo);
        System.out.println(i);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 根据vip_id删除套餐
     * @param vip_id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteVipInfoById")
    public Object deleteVipInfoById(@RequestParam int vip_id){
        int i = vipInfoService.deleteVipInfoById(vip_id);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 添加Vip套餐
     * @param vipInfo
     * @return
     */
    @ResponseBody
    @RequestMapping("addVipInfo")
    public Object addVipInfo(@RequestBody  VipInfo vipInfo){
        int i =vipInfoService.addVipInfo(vipInfo);
        System.out.println(i);
        if(i>0){
            return true;
        }else {
            return false;
        }
    }

}
