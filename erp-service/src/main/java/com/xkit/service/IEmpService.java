package com.xkit.service;

import com.xkit.pojo.Dep;
import com.xkit.pojo.Emp;

import java.util.List;

public interface IEmpService {


    public Emp queryEmpByNameAndPwd(String username,String pwd);

    public int updatePassword(String pwd,Integer id);
}
