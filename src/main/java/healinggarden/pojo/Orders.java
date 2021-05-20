package healinggarden.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int id;
    private int userId;
    private float money;
    private LocalDateTime time;
}
