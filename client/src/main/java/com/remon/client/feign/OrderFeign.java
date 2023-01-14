package com.remon.client.feign;

import com.remon.client.entity.Order;
import com.remon.client.entity.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "order")
public interface OrderFeign {

    @PostMapping("/order/save")
    public void save (@RequestBody Order order);

    @GetMapping("/order/findAllByUid/{index}/{limit}/{uid}")
    public OrderVO findAllByUid(@PathVariable("index") int index, @PathVariable("limit") int limit, @PathVariable("uid") long uid);

    @GetMapping("/order/findAll/{page}/{limit}")
    public OrderVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

    @PutMapping("/order/updateState/{id}")
    public void updateState(@PathVariable("id") long id);

}
