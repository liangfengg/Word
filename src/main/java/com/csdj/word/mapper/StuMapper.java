package com.csdj.word.mapper;


import com.csdj.word.entity.StuClass;
import com.csdj.word.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StuMapper {
    List<Student> findStu(@Param(value = "stuname") String stuname,
                          @Param(value = "currPage") int currPage,
                          @Param(value = "pageSize") int pageSize);

    int findStuCount(@Param(value = "stuname") String stuname);

    int addStu(Student student);

    int delStu(@Param(value = "stuid") int stuid);

    Student findStuIdById(@Param(value = "stuid") int stuid);

    int updateStu(Student student);

    List<StuClass> findClass();

    Student stuLogin(@Param(value = "stuname") String stuname);
}


