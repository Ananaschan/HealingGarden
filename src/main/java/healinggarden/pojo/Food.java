package healinggarden.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    private int id;
    private String foodName;
    private int foodType;
    private float price;
    private String description;
}
