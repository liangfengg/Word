package com.csdj.word.mapper;

import com.csdj.word.entity.Mark;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName MarkMapper
 * @Description
 * @Author 周佳良
 * @Date 2020/1/4 13:52
 * @Version 1.0
 **/
@Mapper
public interface MarkMapper {
    int addMark(Mark mark);

    Mark findMarkList(@Param(value = "pnum") String pnum,
                      @Param(value = "stuId") int stuId,
                      @Param(value = "cid") int cid);
}
