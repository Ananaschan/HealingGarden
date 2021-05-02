package healinggarden.service.admin;

import healinggarden.pojo.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<Admin> getAdminList();
    Admin adminLogin(Admin admin);
}
