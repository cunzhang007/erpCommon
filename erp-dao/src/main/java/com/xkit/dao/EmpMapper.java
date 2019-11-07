package com.xkit.dao;
import com.xkit.pojo.Dep;
import com.xkit.pojo.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface EmpMapper {


    public Emp queryEmpByNameAndPwd(@Param("username") String username, @Param("pwd") String pwd);


    public int updatePassword(@Param("pwd") String pwd,@Param("id") Integer id);
}
