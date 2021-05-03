package healinggarden.mapper;

import healinggarden.pojo.FoodType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
@Mapper
public interface FoodTypeMapper {
    List<FoodType> getFoodTypeList();

    int addFoodType(FoodType foodType);

    int deleteFoodType(int id);

    FoodType getFoodTypeById(int id) throws SQLException;

    int updateFoodType(FoodType foodType) throws SQLException;
}
