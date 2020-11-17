package com.tw.orderitemservice.main.service;


import com.tw.orderitemservice.main.domain.OrderItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "order-item", url = "http://localhost:8080")
public interface OrderItemClient {
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<OrderItem> getItems();

    @RequestMapping(value = "/orderitem/{id}", method = RequestMethod.GET)
    public OrderItem getProduct(@PathVariable("id") int orderItemId);
}
