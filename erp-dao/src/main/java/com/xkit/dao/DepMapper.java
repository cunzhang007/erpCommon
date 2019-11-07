package com.xkit.dao;
import com.xkit.pojo.Dep;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepMapper {

    public List<Dep> queryDeps(@Param("dep")Dep dep);

    public int saveDep(@Param("dep") Dep dep);

    public int delDep(Integer id);
}
