package com.lt.xinshui.service;

import com.lt.xinshui.entity.MyResponseModel;
import com.lt.xinshui.entity.User;

public interface UserService {

    MyResponseModel getAllUser(Integer page, Integer limit);

    MyResponseModel insertUser(User user);

    MyResponseModel getUser(User user);

    MyResponseModel updateUser(User user);

    MyResponseModel getDeletedUser(Integer page, Integer limit);
}
