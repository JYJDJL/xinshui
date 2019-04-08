package com.lt.xinshui.service;

import com.lt.xinshui.entity.MyResponseModel;

public interface ReserveFundService {

    MyResponseModel insertReserveFund(String conditionStr);

    MyResponseModel getReserveFund(Integer page, Integer limit);
}
