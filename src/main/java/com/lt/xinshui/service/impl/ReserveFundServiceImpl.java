package com.lt.xinshui.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lt.xinshui.entity.MyResponseModel;
import com.lt.xinshui.entity.ReserveFund;
import com.lt.xinshui.mapper.ReserveFundMapper;
import com.lt.xinshui.service.ReserveFundService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ReserveFundServiceImpl implements ReserveFundService {

    private ReserveFundMapper reserveFundMapper;
    @Resource
    public void setReserveFundMapper(ReserveFundMapper reserveFundMapper) {
        this.reserveFundMapper = reserveFundMapper;
    }

    @Override
    public MyResponseModel insertReserveFund(String conditionStr) {
        ReserveFund reserveFund = JSON.parseObject(conditionStr,ReserveFund.class);
        int i = this.reserveFundMapper.insertSelective(reserveFund);
        MyResponseModel myResponseModel = new MyResponseModel();
        if(i > 0){
            myResponseModel.setCode("0");
        }
        return myResponseModel;
    }

    @Override
    public MyResponseModel getReserveFund(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<ReserveFund> reserveFundList = this.reserveFundMapper.getReserveFund();
        PageInfo<ReserveFund> reserveFundPageInfo = new PageInfo<>(reserveFundList);

        MyResponseModel myResponseModel = new MyResponseModel();
        myResponseModel.setCode("0");
        myResponseModel.setCount(reserveFundPageInfo.getTotal());
        myResponseModel.setData(reserveFundList);
        myResponseModel.setMsg("success");
        return myResponseModel;
    }
}
