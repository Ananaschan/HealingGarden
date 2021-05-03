package healinggarden;


import healinggarden.service.foodtype.FoodTypeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.sql.SQLException;

@SpringBootTest
class QinApplicationTests {

    @Autowired
    public FoodTypeServiceImpl foodTypeService;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(foodTypeService.getFoodTypeList().toString());
    }

}
