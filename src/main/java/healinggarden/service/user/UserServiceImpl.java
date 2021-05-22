package healinggarden.service.user;

import healinggarden.mapper.UserMapper;
import healinggarden.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public List<User> getUserList() throws SQLException {
        return userMapper.getUserList();
    }

    @Override
    public User getUserById(int id) throws SQLException {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByName(User user) throws SQLException {
        return userMapper.getUserByName(user);
    }

    @Override
    public List<User> getUserByKey(User user) throws SQLException {
        return userMapper.getUserByKey(user);
    }

    @Override
    public int updateUser(User user) throws SQLException {
        return userMapper.updateUser(user);
    }

    @Override
    public User userLogin(User user) throws SQLException {
        return userMapper.userLogin(user);
    }
}
