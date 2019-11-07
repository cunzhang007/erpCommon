package com.xkit.dao;
import com.xkit.pojo.Menu;
import com.xkit.pojo.Orders;

import java.util.List;

public interface OrderMapper {

    public List<Orders> queryOrders(Orders orders);


}
