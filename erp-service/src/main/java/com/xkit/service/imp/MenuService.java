package com.xkit.service.imp;

import com.xkit.dao.EmpMapper;
import com.xkit.dao.MenuMapper;
import com.xkit.pojo.Menu;
import com.xkit.service.IEmpService;
import com.xkit.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> queryMenus(Integer eid) {
        return menuMapper.queryMenus(eid);
    }
}
