package healinggarden.service.orders;

import healinggarden.mapper.OrdersMapper;
import healinggarden.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    public OrdersMapper ordersMapper;

    @Override
    public List<Orders> getOrderList() {
        return ordersMapper.getOrderList();
    }

}
