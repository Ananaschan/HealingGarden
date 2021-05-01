package healinggarden.service.admin;

import healinggarden.mapper.AdminMapper;
import healinggarden.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> getAdminList() {
        return adminMapper.getAdminList();
    }

    @Override
    public Admin adminLogin(Admin admin) {
        return adminMapper.adminLogin(admin);
    }
}
