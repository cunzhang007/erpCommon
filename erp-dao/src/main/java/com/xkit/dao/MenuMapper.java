package com.xkit.dao;
import com.xkit.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {


    public List<Menu> queryMenus(Integer eid);

}
