package com.xkit.controller;


import com.xkit.dao.EmpMapper;
import com.xkit.pojo.Emp;
import com.xkit.service.IEmpService;
import com.xkit.service.imp.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private IEmpService empService;

    @RequestMapping("/toLoginPage")
    public String toLoginPage(){
        return "login";
    }

    @RequestMapping("/index.html")
    public String index(){
        return  "index";
    }

    @RequestMapping("/getUserName.do")
    @ResponseBody
    public Map<String,String> getUserName(HttpSession session){
        Emp emp = (Emp) session.getAttribute("loginUser");
        Map<String,String> map = new HashMap<String, String>();
        map.put("loginUser",emp.getUsername());
        return map;
    }

    @PostMapping("/login.do")
    @ResponseBody
    public Map<String,Object> login(HttpSession session,String username, String pwd){
        Emp e = empService.queryEmpByNameAndPwd(username, pwd);
        boolean success =false;
        String msg = "登录失败！";
        if(e != null){
            success=true;
            //把当前登录用户，写入session
            session.setAttribute("loginUser",e);
        }
        //响应的数据封装 {success:false,"msg":"失败！"}
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("success",success);
        map.put("msg",msg);
        return map;
    }
}
