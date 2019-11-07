package com.xkit.service.imp;

import com.xkit.dao.DepMapper;
import com.xkit.pojo.Dep;
import com.xkit.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepService implements IDepService {

    @Autowired
    private DepMapper depMapper;

    public Dep queryDepById(Dep dep){
        return depMapper.queryDeps(dep).get(0);
    }


    public List<Dep> queryDeps(Dep dep){
        return depMapper.queryDeps(dep);
    }

    public int saveDep(Dep dep) {
        return depMapper.saveDep(dep);
    }

    public int delDep(Integer id) {
        return depMapper.delDep(id);
    }

    public void setDepMapper(DepMapper depMapper) {
        this.depMapper = depMapper;
    }
}
