package com.lt.xinshui.controller;

import com.alibaba.fastjson.JSON;
import com.lt.xinshui.entity.MyResponseModel;
import com.lt.xinshui.entity.User;
import com.lt.xinshui.service.UserService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userCtrl")
public class UserController {

    private UserService userService;
    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 打开人员页面
     */
    @RequestMapping("/goUserManage")
    public String goTest(){
        return "/user_manage";
    }

    /**
     * 获取在职人员信息
     */
    @RequestMapping(value = "getAllUser",method = RequestMethod.GET)
    @ResponseBody
    public MyResponseModel getAllUser(Integer page,Integer limit){

        return this.userService.getAllUser(page,limit);
    }
    /**
     * 获取离职人员信息
     */
    @RequestMapping(value = "getDeletedUser",method = RequestMethod.GET)
    @ResponseBody
    public MyResponseModel getDeletedUser(Integer page,Integer limit){

        return this.userService.getDeletedUser(page,limit);
    }


    /**
     * 新增人员
     */
    @RequestMapping(value = "insertUser")
    @ResponseBody
    public MyResponseModel insertUser(String conditionStr){
        User user = JSON.parseObject(conditionStr,User.class);

        return this.userService.insertUser(user);
    }

    /**
     * 获取单个人员信息
     */
    @RequestMapping(value = "getUser")
    @ResponseBody
    public MyResponseModel getUser(String conditionStr){
        User user = JSON.parseObject(conditionStr,User.class);
        return this.userService.getUser(user);
    }

    /**
     * 修改人员信息
     */
    @RequestMapping(value = "updateUser")
    @ResponseBody
    public MyResponseModel updateUser(String conditionStr){
        User user = JSON.parseObject(conditionStr,User.class);

        return this.userService.updateUser(user);
    }




}
