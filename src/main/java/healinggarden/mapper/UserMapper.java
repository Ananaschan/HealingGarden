package healinggarden.mapper;

import healinggarden.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    /**
     * 添加用户
     **/
    int addUser(User user);

    /**
     * 删除用户
     **/
    int deleteUser(int id);

    /**
     * 查询用户列表
     **/
    List<User> getUserList() throws SQLException;

    /**
     * 得到单个用户
     **/
    User getUserById(int id) throws SQLException;


    User getUserByName(User user) throws SQLException;

    /**
     * 关键字查询
     **/
    List<User> getUserByKey(User user) throws SQLException;

    /**
     *修改用户信息
     **/
    int updateUser(User user) throws SQLException;

}
