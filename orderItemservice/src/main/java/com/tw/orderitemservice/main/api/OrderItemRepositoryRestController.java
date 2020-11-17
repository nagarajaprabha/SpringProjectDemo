package com.tw.orderitemservice.main.api;

import com.tw.orderitemservice.main.domain.OrderItem;
import com.tw.orderitemservice.main.domain.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestController
@RequestMapping("/orderItems")
public class OrderItemRepositoryRestController {
    @Autowired
    private OrderItemRepository orderItemRepository;


    @PostMapping
    @ResponseBody
    public OrderItem create(@RequestBody OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public int ii;

    @GetMapping
    @ResponseBody
    public List<OrderItem> getAll() {
        Iterable<OrderItem> it = orderItemRepository.findAll();
        List<OrderItem> result = new ArrayList();
        it.forEach(result::add);
        return result;
    }

}
