package com.csdj.word.controller;

import com.alibaba.fastjson.JSON;
import com.csdj.word.entity.StuClass;
import com.csdj.word.entity.Student;
import com.csdj.word.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StuController {
    @Resource
    private StuService service;

    @RequestMapping(value = "stuShow")
    public String show() {
        return "student/show";
    }

    @RequestMapping(value = "add")
    public String add() {
        return "student/add";
    }

    @RequestMapping(value = "findStu", produces = "text/json;charset=utf-8")
    @ResponseBody
    public Object findStu(@RequestParam(value = "stuname", required = false) String stuname,
                          @RequestParam(value = "page", required = false) Integer currPage,
                          @RequestParam(value = "limit", required = false) Integer pageSize) {
        if (currPage == null) {//如果当前页为空，则默认为第1页
            currPage = 1;
        }
        if (pageSize == null) {//如果每页条数为空，则默认为每页10条
            pageSize = 10;
        }
        int limitOne = (currPage - 1) * pageSize;//计算出从哪一条开始显示
        //记录集合
        List<Student> list = service.findStu(stuname, limitOne, pageSize);
        //总条数
        int count = service.findStuCount(stuname);
//        System.err.println("记录数：" + count);
        String strJson = JSON.toJSONString(list);
        //layui json 格式
        String json = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + strJson + "}";
//        System.err.println(json);
        return json;
    }

    @RequestMapping(value = "addStu")
    @ResponseBody
    public Object addStu(Student student) {
        int i = service.addStu(student);
        return JSON.toJSONString(i);
    }

    @RequestMapping(value = "delStu")
    @ResponseBody
    public Object delStu(@RequestParam(value = "stuid") int stuid) {
        int i = service.delStu(stuid);
        return JSON.toJSONString(i);
    }

    @RequestMapping(value = "findStuIdById", produces = "text/json;charset=utf-8")
    @ResponseBody
    public Object findStuIdById(@RequestParam(value = "stuid") int stuid) {
        Student student = service.findStuIdById(stuid);
        return JSON.toJSONString(student);
    }

    @RequestMapping(value = "updateStu")
    @ResponseBody
    public Object updateStu(Student student) {
        int i = service.updateStu(student);
        return JSON.toJSONString(i);
    }

    @RequestMapping(value = "findClass", produces = "text/json;charset=utf-8")
    @ResponseBody
    public Object findClass() {
        List<StuClass> list = service.findClass();
        return JSON.toJSONString(list);
    }
}
