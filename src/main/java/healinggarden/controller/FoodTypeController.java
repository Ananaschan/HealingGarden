package healinggarden.controller;

import healinggarden.pojo.FoodType;
import healinggarden.service.foodtype.FoodTypeService;
import healinggarden.service.foodtype.FoodTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodTypeController {
    @Autowired
    public FoodTypeServiceImpl foodTypeService;

    @ResponseBody
    @RequestMapping("/getFoodTypeList")
    public List<FoodType> getFoodTypeList() {
        return foodTypeService.getFoodTypeList();
    }

    @RequestMapping("/addFoodType")
    public int addFoodType(@RequestBody FoodType foodType) {
        return foodTypeService.addFoodType(foodType);
    }

    @RequestMapping("/deleteFoodType")
    public int deleteFoodType(int id) {
        return foodTypeService.deleteFoodType(id);
    }

    @ResponseBody
    @RequestMapping("/getFoodTypeById")
    public FoodType getFoodTypeById(int id) throws SQLException {
        return foodTypeService.getFoodTypeById(id);
    }

    @RequestMapping("/updateFoodType")
    public int updateFoodType(@RequestBody FoodType foodType) throws SQLException {
        System.out.println(foodType.toString());
        return foodTypeService.updateFoodType(foodType);
    }
}
