package com.itheima.controller;

import com.ithieima.po.Orders;
import com.ithieima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class OrdersController {
    @RequestMapping("/toFindOrdersWithUser")
    public String toFindOrdersWithUser(){
        return "orders";
    }
    @RequestMapping("findOrdersWithUser")
    public String findOrdersWithUser(Orders orders)
    {
        Integer ordersId=orders.getOrdersId();
        User user=orders.getUser();
        String username=user.getUsername();
        System.out.println("ordersId="+ordersId);
        System.out.println("username="+username);
        return "success";
    }
}
