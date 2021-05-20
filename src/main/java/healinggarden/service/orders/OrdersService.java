package healinggarden.service.orders;

import healinggarden.pojo.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdersService {
    List<Orders> getOrderList();
}
