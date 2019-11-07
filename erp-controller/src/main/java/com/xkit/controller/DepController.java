package com.xkit.controller;


import com.xkit.pojo.Dep;
import com.xkit.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class DepController {

    @Autowired
    private IDepService depService;

    @GetMapping("/toDepPage")
    public String getDepPage(){
        return "dep";
    }

    @RequestMapping("/saveDep.do")
    @ResponseBody
    public Map<String,String> saveDep(Dep dep){
        int i = depService.saveDep(dep);
        String msg = "error";
        if(i > 0){
            msg = "ok";
        }
        Map<String,String> map = new HashMap<String, String>();
        map.put("message","添加成功！");
        return map;
    }

    @RequestMapping("/queryDepById.do")
    @ResponseBody
    public Dep updateDep(Dep dep){
        Dep dep1 = depService.queryDepById(dep);
        Map<String,String> map = new HashMap<String, String>();
        map.put("message","添加成功！");
        return dep1;
    }

    @RequestMapping("/delDep.do")
    @ResponseBody
    public Map<String,String> delDep(Integer id){
        int i = depService.delDep(id);
        String msg = "删除失败！";
        if(i > 0){
            msg = "ok";
        }
        Map<String,String> map = new HashMap<String, String>();
        map.put("message","删除成功！");
        return map;
    }


    @RequestMapping("/queryDeps.do")
    @ResponseBody
    public Map<String,Object> queryDeps(Dep dep,Integer page,Integer rows){
        System.out.println(page);
        System.out.println(rows);
        System.out.println(dep);

        //参数1:第几页 参数二:查询总数
        Page<Dep> pageDep = PageHelper.startPage(page,rows);
        List<Dep> deps = depService.queryDeps(dep);
        PageInfo<Dep> p = new PageInfo<Dep>(deps);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total",p.getTotal());
        map.put("rows",p.getList());
        return  map;
    }


    @GetMapping("/toDepPage1")
    public String getDepPage1(){
        return "dep1";
    }

    @RequestMapping("/queryDeps1.do")
    @ResponseBody
    public Map<String,Object> queryDeps1(Dep dep,Integer page,Integer rows){
        System.out.println(dep);
        //pageHelper
        Page<Dep> pageDep = PageHelper.startPage(page,rows);
        List<Dep> depList = depService.queryDeps(dep);
        PageInfo<Dep> pageInfo = new PageInfo<Dep>(depList);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",depList);
        //easyUI决定了 {total：10,rows:[{id:1,name:'张三'}]}
        return map;
    }

}
