package healinggarden.controller;

import healinggarden.pojo.User;
import healinggarden.service.user.UserService;
import healinggarden.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    public UserService userService;

    //用户登入

    @RequestMapping("/userLogin")
    public boolean login(User user, HttpServletRequest httpServletRequest) throws SQLException {

        User user1 = userService.getUserByName(user);
        boolean flag = false;
        if (user1.getUserName().equals(user.getUserName())&&user1.getPassword().equals(user.getPassword())){
            flag = true;
        }

        //向session中添加用户信息
        if (flag){
            httpServletRequest.getSession().setAttribute(Constants.USER_SESSION,user1);
        }
        return flag;
    }

    //用户注销
    @RequestMapping("/userLogout")
    public String logout(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().removeAttribute(Constants.USER_SESSION);
        return "ok";
    }

    //添加用户
    @RequestMapping("/addUser")
    public int addUser(User user){
        return userService.addUser(user);
    }

    //获取用户列表
    @RequestMapping("/userList")
    public List<User> getUserList() throws SQLException {
        return userService.getUserList();
    }

    //关键字查询
    @RequestMapping("/admin/key")
    public List<User> getUserByKey(User user) throws SQLException {
        user.setUserName("%"+user.getUserName()+"%");
        return userService.getUserByKey(user);
    }
}
