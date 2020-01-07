package com.csdj.word.mapper;

import com.csdj.word.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName TeacherMapper
 * @Description
 * @Author 周佳良
 * @Date 2019/12/30 11:39
 * @Version 1.0
 **/
@Mapper
public interface TeacherMapper {
    int login(@Param(value = "tname") String tname, @Param(value = "tpwd") String tpwd);

    int updateTeacher(Teacher teacher);
}
