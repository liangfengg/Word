package com.csdj.word.service;

import com.csdj.word.entity.Teacher;

/**
 * @ClassName TeacherService
 * @Description
 * @Author 周佳良
 * @Date 2019/12/30 13:37
 * @Version 1.0
 **/
public interface TeacherService {
    int login(String tname, String tpwd);

    int updateTeacher(Teacher teacher);
}
