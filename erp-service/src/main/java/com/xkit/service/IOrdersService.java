package com.xkit.service;

import com.xkit.pojo.Menu;
import com.xkit.pojo.Orders;

import java.util.List;

public interface IOrdersService {

    public List<Orders> queryOrders(Orders orders);

}
