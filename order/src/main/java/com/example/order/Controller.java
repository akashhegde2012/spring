package com.example.order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
import com.example.order.Order;
@RequestMapping("/orders")
@RestController()
public class Controller{
    private final List<Order> orders = Arrays.asList(
        new Order(1,"prod1"),
        new Order(2,"p2"));
    @GetMapping()
    public List<Order> getAllOrders(){
        return orders;
    }
}