package com.ac.gmall.user.controller;

import entity.UserMember;
import org.hibernate.validator.constraints.EAN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-11-22
 * @description：
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

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
