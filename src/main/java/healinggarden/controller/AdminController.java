package healinggarden.controller;

import healinggarden.pojo.Admin;
import healinggarden.service.admin.AdminServiceImpl;
import healinggarden.util.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class AdminController {
    @Autowired
    private AdminServiceImpl adminService;

    @CrossOrigin
    @RequestMapping("/adminList")
    @ResponseBody
    public List<Admin> getAdminList(){
        return adminService.getAdminList();
    }

    @CrossOrigin
    @RequestMapping("/adminLogin")
    @ResponseBody
    public ResultCode adminLogin(@RequestBody Admin admin){
        System.out.println(admin);

        if (adminService.adminLogin(admin) != null){
            //密码正确
            return new ResultCode(200);
        }else{
            //密码错误
            return new ResultCode(400);
        }
    }
}
