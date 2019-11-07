package com.xkit.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkit.pojo.Dep;
import com.xkit.pojo.Emp;
import com.xkit.pojo.Menu;
import com.xkit.pojo.Orders;
import com.xkit.service.IMenuService;
import com.xkit.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class OrderController {

    @Autowired
    private IOrdersService ordersService;

    @RequestMapping("/toAddOrderPage")
    public String toAddOrderPage(){
        return "order_add";
    }

    @RequestMapping("/toOrdersPage")
    public String toOrdersPage(){
        return "orders";
    }


    @RequestMapping("/orders_listByPage.do")
    @ResponseBody
    public List<Orders> queryOrders(Orders orders,Integer page,Integer rows){
        //参数1:第几页 参数二:查询总数
        Page<Orders> pageOrders = PageHelper.startPage(page,rows);
        List<Orders> ordersList = ordersService.queryOrders(orders);
        PageInfo<Orders> p = new PageInfo<Orders>(ordersList);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total",p.getTotal());
        map.put("rows",p.getList());

        return ordersList;
    }
}
