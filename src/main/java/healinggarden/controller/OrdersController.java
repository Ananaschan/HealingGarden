package healinggarden.controller;

import healinggarden.pojo.Orders;
import healinggarden.service.orders.OrdersService;
import healinggarden.service.orders.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {
    @Autowired
    public OrdersService ordersService;

    @RequestMapping("/getOrders")
    public List<Orders> getOrders(){
        return ordersService.getOrderList();
    }
}
