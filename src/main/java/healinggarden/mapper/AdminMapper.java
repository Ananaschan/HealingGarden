package healinggarden.mapper;

import healinggarden.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface AdminMapper {
    List<Admin> getAdminList();
    Admin adminLogin(Admin admin);
}
