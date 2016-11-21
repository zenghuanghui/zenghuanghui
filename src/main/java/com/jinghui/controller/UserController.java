package com.jinghui.controller;

import com.jinghui.common.utils.EncryptSHA1;
import com.jinghui.model.User;
import com.jinghui.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zenghuanghui on 2016/11/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUserList")
    public String getUserList(HttpServletRequest request){
        List<User> lsUser = userService.selectUserList();
        request.setAttribute("lsUser",lsUser);
        return "User/userList";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "metroLogin";
    }

    @RequestMapping("/logoutUser")
    public String logoutUser(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "metroLogin";
    }

    @RequestMapping("/loginUser")
    @ResponseBody
    public Map loginUser(HttpServletRequest request, String username, String password){
        Map map = new HashMap<String, Object>();
        EncryptSHA1 te = new EncryptSHA1();
        String encodePw = te.Encrypt(password, "SHA-1");// 前缀+密码明文加密生成最终密码
        logger.info("loginUser:"+encodePw);
        User user = new User();
        user.setUserName(username);
        user.setPassword(encodePw);
        user = userService.selectUser(user);
        if(null != user){
            request.getSession().setAttribute("user",user);
            map.put("result","success");
        }else{
            map.put("result","error");
        }
        return map;
    }
}
