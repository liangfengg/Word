package com.csdj.word.service.impl;

import com.csdj.word.entity.StuClass;
import com.csdj.word.entity.Student;
import com.csdj.word.mapper.StuMapper;
import com.csdj.word.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Resource
    private StuMapper stuMapper;

    @Override
    public List<Student> findStu(String stuname, int currPage, int pageSize) {
        return stuMapper.findStu(stuname, currPage, pageSize);
    }

    @Override
    public int findStuCount(String stuname) {
        return stuMapper.findStuCount(stuname);
    }

    @Override
    public int addStu(Student student) {
        return stuMapper.addStu(student);
    }

    @Override
    public int delStu(int stuid) {
        return stuMapper.delStu(stuid);
    }

    @Override
    public Student findStuIdById(int stuid) {
        return stuMapper.findStuIdById(stuid);
    }

    @Override
    public int updateStu(Student student) {
        return stuMapper.updateStu(student);
    }

    @Override
    public List<StuClass> findClass() {
        return stuMapper.findClass();
    }

    @Override
    public Student stuLogin(String stuname) {
        return stuMapper.stuLogin(stuname);
    }
}
