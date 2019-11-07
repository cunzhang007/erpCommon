package com.xkit.service;

import com.xkit.pojo.Dep;

import java.util.List;

public interface IDepService {

    public List<Dep> queryDeps(Dep dep);
    public int saveDep(Dep dep);
    public int delDep(Integer id);
    public Dep queryDepById(Dep dep);
}
