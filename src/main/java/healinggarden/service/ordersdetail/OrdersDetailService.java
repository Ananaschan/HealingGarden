package healinggarden.service.ordersdetail;

import healinggarden.pojo.OrdersDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdersDetailService {
    List<OrdersDetail> getOrdersDetail(int id);
}
