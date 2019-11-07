package com.xkit.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xkit.pojo.Dep;
import com.xkit.pojo.Emp;
import com.xkit.service.IDepService;
import com.xkit.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class EmpController {

    @Autowired
    private IEmpService empService;

    @GetMapping("/toEmpPage")
    public String getEmpPage(){
        return "emp";
    }


    @PostMapping("/updatePassword.do")
    @ResponseBody
    public String updatePassword(String newpass, HttpSession session){
        Emp emp = (Emp) session.getAttribute("loginUser");
        int i = empService.updatePassword(newpass,emp.getId());
        if(i == 1){
            return newpass;
        }
        return "修改失败";
    }


}
