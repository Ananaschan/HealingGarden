package healinggarden;


import healinggarden.service.food.FoodServiceImpl;
import healinggarden.service.foodtype.FoodTypeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.sql.SQLException;

@SpringBootTest
class QinApplicationTests {

    @Autowired
    public FoodServiceImpl foodService;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(foodService.getFoodList().toString());
    }

}
