package healinggarden;

import healinggarden.pojo.User;
import healinggarden.service.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class QinApplicationTests {

    @Autowired
    @Qualifier("userServiceImpl")
    public UserService userService;

    @Test
    void contextLoads() throws SQLException {
        User user = new User();
        user.setUserName("name4");
        user.setAddress("hz");
        user.setPassword("123456");
        user.setTelephone("123321");
        userService.addUser(user);
    }

}
