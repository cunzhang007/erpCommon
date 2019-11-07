package com.xkit.service.imp;

import com.xkit.dao.MenuMapper;
import com.xkit.dao.OrderMapper;
import com.xkit.pojo.Menu;
import com.xkit.pojo.Orders;
import com.xkit.service.IMenuService;
import com.xkit.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService {


    @Autowired
    private OrderMapper orderMapper;

    public List<Orders> queryOrders(Orders orders) {
        return orderMapper.queryOrders(orders);
    }


}
