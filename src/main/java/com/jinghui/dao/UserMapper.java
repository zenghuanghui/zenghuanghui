package com.jinghui.dao;

import com.jinghui.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zenghuanghui on 2016/11/8.
 */
@Repository
public interface UserMapper {
    List<User> selectUserList();

    User selectUser(User user);
}
