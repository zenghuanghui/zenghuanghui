package com.jinghui.controller;

import com.jinghui.model.User;
import com.jinghui.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zenghuanghui on 2016/11/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUserList")
    public String getUserList(HttpServletRequest request){
        List<User> lsUser = userService.selectUserList();
        request.setAttribute("lsUser",lsUser);
        return "User/userList";
    }
}
