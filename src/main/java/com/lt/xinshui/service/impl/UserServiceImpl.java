package com.lt.xinshui.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lt.xinshui.entity.MyResponseModel;
import com.lt.xinshui.entity.User;
import com.lt.xinshui.mapper.UserMapper;
import com.lt.xinshui.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    @Resource
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public MyResponseModel getAllUser(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<User> userList = this.userMapper.getAllUser();
        PageInfo<User> userPageInfo = new PageInfo<>(userList);

        MyResponseModel myResponseModel = new MyResponseModel();
        myResponseModel.setCode("0");
        myResponseModel.setCount(userPageInfo.getTotal());
        myResponseModel.setData(userList);
        myResponseModel.setMsg("success");
        return myResponseModel;
    }

    @Override
    public MyResponseModel insertUser(User user) {
        user.setIsActive("1");
        int i = this.userMapper.insert(user);
        MyResponseModel myResponseModel = new MyResponseModel();
        if(i > 0){
            myResponseModel.setCode("0");
        }else{
            myResponseModel.setCode("500");
            myResponseModel.setMsg("失败");
        }
        return myResponseModel;
    }

    @Override
    public MyResponseModel getUser(User user) {
        User user1 = this.userMapper.selectByPrimaryKey(user.getId());
        MyResponseModel myResponseModel = new MyResponseModel();
        myResponseModel.setData(user1);
        return myResponseModel;
    }

    @Override
    public MyResponseModel updateUser(User user) {
        int i = this.userMapper.updateByPrimaryKeySelective(user);
        MyResponseModel myResponseModel = new MyResponseModel();
        if(i > 0){
            myResponseModel.setCode("0");
        }
        return myResponseModel;
    }

    @Override
    public MyResponseModel getDeletedUser(Integer page, Integer limit) {

        PageHelper.startPage(page, limit);
        List<User> userList = this.userMapper.getDeletedUser();
        PageInfo<User> userPageInfo = new PageInfo<>(userList);

        MyResponseModel myResponseModel = new MyResponseModel();
        myResponseModel.setCode("0");
        myResponseModel.setCount(userPageInfo.getTotal());
        myResponseModel.setData(userList);
        myResponseModel.setMsg("success");
        return myResponseModel;
    }
}
