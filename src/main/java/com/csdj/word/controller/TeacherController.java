package com.csdj.word.controller;

import com.alibaba.fastjson.JSON;
import com.csdj.word.entity.Teacher;
import com.csdj.word.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TeacherController {

    @Resource
    private TeacherService service;

    @ResponseBody
    @RequestMapping(value = "updateTeacher")
    public Object updateTeacher(Teacher teacher) {
        int i = service.updateTeacher(teacher);
        return JSON.toJSONString(i);
    }
}
