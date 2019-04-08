package com.lt.xinshui.mapper;

import com.lt.xinshui.entity.ReserveFund;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReserveFundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReserveFund record);

    int insertSelective(ReserveFund record);

    ReserveFund selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReserveFund record);

    int updateByPrimaryKey(ReserveFund record);

    List<ReserveFund> getReserveFund();
}