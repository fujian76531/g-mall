package com.ac.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.UserMember;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-11-22
 * @description：
 */
@Controller
public class UserController {
    @Reference
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("getAll")
    @ResponseBody
    public List<UserMember> getAll(){
        return userService.getAll();
    }
}
