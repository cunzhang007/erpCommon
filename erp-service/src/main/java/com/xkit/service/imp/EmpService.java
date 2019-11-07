package com.xkit.service.imp;

import com.xkit.dao.DepMapper;
import com.xkit.dao.EmpMapper;
import com.xkit.pojo.Dep;
import com.xkit.pojo.Emp;
import com.xkit.service.IDepService;
import com.xkit.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService implements IEmpService {

    @Autowired
    private EmpMapper empMapper;


    public Emp queryEmpByNameAndPwd(String username, String pwd) {
        return empMapper.queryEmpByNameAndPwd(username, pwd);
    }

    public int updatePassword(String pwd, Integer id) {
        return empMapper.updatePassword(pwd,id);
    }
}
