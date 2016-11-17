package src.main.java.controllers;

import models.*;
import services.interfaces.*;

@OrderController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Order> getOrders() {
        return orderService.getAll();

    }
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public String createOrder(@ModelAttribute("orderform") Order order) {

    	orderService.placeOrder();
    }

}
