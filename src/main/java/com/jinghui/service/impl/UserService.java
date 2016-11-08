package com.jinghui.service.impl;

import com.jinghui.dao.UserMapper;
import com.jinghui.model.User;
import com.jinghui.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zenghuanghui on 2016/11/8.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }
}
