package healinggarden.service.food;

import healinggarden.pojo.Food;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface FoodService {
    List<Food> getFoodList() throws SQLException;
    Food getFoodById(int id) throws SQLException;
    int updateFood(Food food) throws SQLException;
    int deleteFood(int id) throws SQLException;
    int addFood(Food food) throws SQLException;
}
