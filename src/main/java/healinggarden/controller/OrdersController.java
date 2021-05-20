package healinggarden.controller;

import healinggarden.pojo.Orders;
import healinggarden.service.orders.OrdersService;
import healinggarden.service.orders.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrdersController {
    @Autowired
    public OrdersService ordersService;

    @ResponseBody
    @RequestMapping("/getOrders")
    public List<Orders> getOrders(){
        System.out.println("getOrders Start");
        List<Orders> orderList = ordersService.getOrderList();
        System.out.println("orderList:"+orderList);
        return orderList;
    }
}
