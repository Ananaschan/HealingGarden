package healinggarden.mapper;

import healinggarden.pojo.Food;
import java.sql.SQLException;
import java.util.List;

public interface FoodMapper {
    List<Food> getFoodList() throws SQLException;
    Food getFoodById(int id) throws SQLException;
    int updateFood(Food food) throws SQLException;
    int deleteFood(int id) throws SQLException;
    int addFood(Food food) throws SQLException;
}
