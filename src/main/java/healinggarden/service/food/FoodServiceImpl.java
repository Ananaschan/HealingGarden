package healinggarden.service.food;

import healinggarden.mapper.FoodMapper;
import healinggarden.pojo.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService{
    @Autowired
    public FoodMapper foodMapper;

    @Override
    public List<Food> getFoodList() throws SQLException {
        return foodMapper.getFoodList();
    }

    @Override
    public Food getFoodById(int id) throws SQLException {
        return foodMapper.getFoodById(id);
    }

    @Override
    public int updateFood(Food food) throws SQLException {
        return foodMapper.updateFood(food);
    }

    @Override
    public int deleteFood(int id) throws SQLException {
        return foodMapper.deleteFood(id);
    }

    @Override
    public int addFood(Food food) throws SQLException {
        return foodMapper.addFood(food);
    }
}
