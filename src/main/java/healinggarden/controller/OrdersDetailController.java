package healinggarden.controller;

import healinggarden.pojo.OrdersDetail;
import healinggarden.service.ordersdetail.OrdersDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersDetailController {

    @Autowired
    public OrdersDetailService ordersDetailServiceImpl;
    @RequestMapping("/getOrdersDetailById")
    public List<OrdersDetail> getOrdersDetailById(int id){
        return ordersDetailServiceImpl.getOrdersDetail(id);
    }
}
