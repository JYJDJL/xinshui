package com.lt.xinshui.controller;

import com.lt.xinshui.entity.MyResponseModel;
import com.lt.xinshui.service.ReserveFundService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reserveFundCtrl")
public class ReserveFundController {

    private ReserveFundService reserveFundService;
    @Resource
    public void setReserveFundService(ReserveFundService reserveFundService) {
        this.reserveFundService = reserveFundService;
    }

    /**
     * 打开备用金管理页面
     */
    @RequestMapping("/goReserveFundManage")
    public String goReserveFundManage(){
        return "/reserve_fund_manage";
    }

    @RequestMapping("/insertReserveFund")
    @ResponseBody
    public MyResponseModel insertReserveFund(String conditionStr){
        return this.reserveFundService.insertReserveFund(conditionStr);
    }

    @RequestMapping("/getReserveFund")
    @ResponseBody
    public MyResponseModel getReserveFund(Integer page, Integer limit){
        return this.reserveFundService.getReserveFund(page, limit);
    }



}
