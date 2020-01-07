package com.csdj.word.service;

import com.csdj.word.entity.StuClass;
import com.csdj.word.entity.Student;

import java.util.List;

public interface StuService {


    List<Student> findStu(String stuname, int currPage, int pageSize);

    int findStuCount(String stuname);

    int addStu(Student student);

    int delStu(int stuid);

    Student findStuIdById(int stuid);

    int updateStu(Student student);

    List<StuClass> findClass();

    Student stuLogin(String stuname);
}
