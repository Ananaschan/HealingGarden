package healinggarden.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDetail {
    private int id;
    private int foodId;
    private int ordersId;
    private float count;
}
