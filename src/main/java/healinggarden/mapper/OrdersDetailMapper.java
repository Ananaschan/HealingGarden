package healinggarden.mapper;

import healinggarden.pojo.OrdersDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrdersDetailMapper {
    List<OrdersDetail> getOrdersDetail(int id);
}
