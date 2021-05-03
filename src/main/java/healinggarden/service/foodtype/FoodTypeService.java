package healinggarden.service.foodtype;

import healinggarden.pojo.FoodType;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface FoodTypeService {
    List<FoodType> getFoodTypeList();

    int addFoodType(FoodType foodType);

    int deleteFoodType(int id);

    FoodType getFoodTypeById(int id) throws SQLException;

    int updateFoodType(FoodType foodType) throws SQLException;
}
