package healinggarden.service.ordersdetail;

import healinggarden.mapper.OrdersDetailMapper;
import healinggarden.pojo.OrdersDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersDetailServiceImpl implements OrdersDetailService{
    @Autowired
    public OrdersDetailMapper ordersDetailMapper;

    @Override
    public List<OrdersDetail> getOrdersDetail(int id) {
        return ordersDetailMapper.getOrdersDetail(id);
    }
}
