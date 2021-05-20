package healinggarden.mapper;

import healinggarden.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrdersMapper {
    List<Orders> getOrderList();
}
