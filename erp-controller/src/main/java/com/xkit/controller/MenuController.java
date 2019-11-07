package com.xkit.controller;


import com.xkit.pojo.Emp;
import com.xkit.pojo.Menu;
import com.xkit.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Scope("prototype")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @RequestMapping("/queryMenus.do")
    @ResponseBody
    public  Menu queryMenus(HttpSession session){
        Object userObj = session.getAttribute("loginUser");
        Menu m = new Menu();
        if(userObj != null){
            List<Menu> menusList = menuService.queryMenus(((Emp)userObj).getId());
            m.setMenuid("0");
            m.setMenuname("系统菜单");
            m.setIcon("icon-sys");
            m.setMenus(menusList);
        }
        return m;
    }
}
