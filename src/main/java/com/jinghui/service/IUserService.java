package com.jinghui.service;

import com.jinghui.model.User;

import java.util.List;

/**
 * Created by zenghuanghui on 2016/11/8.
 */
public interface IUserService {
    List<User> selectUserList();
}
