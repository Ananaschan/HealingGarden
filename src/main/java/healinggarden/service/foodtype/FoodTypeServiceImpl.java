package healinggarden.service.foodtype;

import healinggarden.mapper.FoodTypeMapper;
import healinggarden.pojo.FoodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class FoodTypeServiceImpl implements FoodTypeService{
    @Autowired
    public FoodTypeMapper foodTypeMapper;

    @Override
    public List<FoodType> getFoodTypeList() {
        return foodTypeMapper.getFoodTypeList();
    }

    @Override
    public int addFoodType(FoodType foodType) {
        return foodTypeMapper.addFoodType(foodType);
    }

    @Override
    public int deleteFoodType(int id) {
        return foodTypeMapper.deleteFoodType(id);
    }

    @Override
    public FoodType getFoodTypeById(int id) throws SQLException {
        return foodTypeMapper.getFoodTypeById(id);
    }

    @Override
    public int updateFoodType(FoodType foodType) throws SQLException {
        return foodTypeMapper.updateFoodType(foodType);
    }
}
