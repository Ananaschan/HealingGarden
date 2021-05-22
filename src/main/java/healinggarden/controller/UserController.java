package healinggarden.controller;

import healinggarden.pojo.User;
import healinggarden.service.user.UserService;
import healinggarden.util.Constants;
import healinggarden.util.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

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
    public ResultCode login(@RequestBody User user) throws SQLException {
        System.out.println("传入的数据"+user.toString());
        if (userService.userLogin(user) != null){
            System.out.println("success login!");
            return new ResultCode(200);
        }
        System.out.println("error login!");
        return new ResultCode(400);
    }

    //用户注销
    @RequestMapping("/userLogout")
    public String logout(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().removeAttribute(Constants.USER_SESSION);
        return "ok";
    }

    //添加用户
    @RequestMapping("/addUser")
    public int addUser(@RequestBody User user) throws SQLException {

        if (userService.getUserByName(user) != null){
            return 0;
        }

        System.out.println(user.toString());
        return userService.addUser(user);
    }

    //获取用户列表
    @RequestMapping("/userList")
    @ResponseBody
    public List<User> getUserList() throws SQLException {
        return userService.getUserList();
    }

    //关键字查询
    @RequestMapping("/key")
    public List<User> getUserByKey(User user) throws SQLException {
        user.setUserName("%"+user.getUserName()+"%");
        return userService.getUserByKey(user);
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public int deleteUser(Integer id) {
        return userService.deleteUser(id);
    }

    //根据id查用户
    @ResponseBody
    @RequestMapping("/getUserById")
    public User getUserById(int id) throws SQLException {
        return userService.getUserById(id);
    }

    //修改用户信息
    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody User user) throws SQLException {
        System.out.println(user.toString());
        return userService.updateUser(user);
    }
}
