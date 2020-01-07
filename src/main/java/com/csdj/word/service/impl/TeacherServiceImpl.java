package com.csdj.word.service.impl;

import com.csdj.word.entity.Teacher;
import com.csdj.word.mapper.TeacherMapper;
import com.csdj.word.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName TeacherServiceImpl
 * @Description
 * @Author 周佳良
 * @Date 2019/12/30 11:25
 * @Version 1.0
 **/
@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper mapper;

    @Override
    public int login(String tname, String tpwd) {
        return mapper.login(tname, tpwd);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return mapper.updateTeacher(teacher);
    }
}
