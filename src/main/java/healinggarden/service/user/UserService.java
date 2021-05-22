package healinggarden.service.user;

import healinggarden.pojo.User;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface UserService {
    int addUser(User user);
    int deleteUser(int id);
    List<User> getUserList() throws SQLException;
    //获取用户信息
    User getUserById(int id) throws SQLException;
    User getUserByName(User user) throws SQLException;
    //关键字搜索
    List<User> getUserByKey(User user) throws SQLException;
    int updateUser(User user) throws SQLException;
    User userLogin(User user) throws SQLException;
}
