package com.lt.xinshui.mapper;

import com.lt.xinshui.entity.ReserveFundType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReserveFundTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReserveFundType record);

    int insertSelective(ReserveFundType record);

    ReserveFundType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReserveFundType record);

    int updateByPrimaryKey(ReserveFundType record);
}