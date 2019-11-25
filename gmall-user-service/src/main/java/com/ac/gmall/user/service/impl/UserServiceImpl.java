package com.ac.gmall.user.service.impl;

import com.ac.gmall.user.mapper.UserMemberMapper;
import com.alibaba.dubbo.config.annotation.Service;
import entity.UserMember;
import entity.UserMemberCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019-11-22
 * @description：
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMemberMapper userMemberMapper;

    @Override
    public List<UserMember> getAll() {
        UserMemberCriteria userMemberCriteria=new UserMemberCriteria();
        UserMemberCriteria.Criteria criteria=userMemberCriteria.createCriteria();
        return userMemberMapper.selectByExample(userMemberCriteria);
    }
}
