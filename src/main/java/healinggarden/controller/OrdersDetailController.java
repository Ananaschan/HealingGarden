package healinggarden.controller;

import healinggarden.pojo.OrdersDetail;
import healinggarden.service.ordersdetail.OrdersDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrdersDetailController {

    @Autowired
    public OrdersDetailService ordersDetailServiceImpl;

    @ResponseBody
    @RequestMapping("/getOrdersDetailById")
    public List<OrdersDetail> getOrdersDetailById(int id){
        System.out.println("getOrdersDetailById Start");
        List<OrdersDetail> ordersDetail = ordersDetailServiceImpl.getOrdersDetail(id);
        System.out.println("ordersDetail:"+ordersDetail);
        return ordersDetail;
    }
}
