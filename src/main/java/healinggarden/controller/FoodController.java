package healinggarden.controller;

        import healinggarden.pojo.Food;
        import healinggarden.service.food.FoodServiceImpl;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;

        import java.sql.SQLException;
        import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodController {
    @Autowired
    public FoodServiceImpl foodService;

    @ResponseBody
    @RequestMapping("/foodList")
    public List<Food> getFoodList() throws SQLException{
        List<Food> foodList = foodService.getFoodList();
        System.out.println("foodList"+foodList.toString());
        return foodList;
    }

    @ResponseBody
    @RequestMapping("/getFoodById")
    public Food getFoodById(int id) throws SQLException{
        Food food = foodService.getFoodById(id);
        System.out.println("getFoodById:"+food.toString());
        return food;
    }

    @RequestMapping("/updateFood")
    int updateFood(@RequestBody Food food) throws SQLException{
        System.out.println("要更新的数据"+food.toString());
        return foodService.updateFood(food);
    }

    @RequestMapping("/deleteFood")
    int deleteFood(int id) throws SQLException{
        return foodService.deleteFood(id);
    }

    @RequestMapping("/addFood")
    int addFood(@RequestBody Food food) throws SQLException{
        return foodService.addFood(food);
    }
}
