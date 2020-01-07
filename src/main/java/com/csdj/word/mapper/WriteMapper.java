package com.csdj.word.mapper;

import com.csdj.word.entity.Word;
import com.csdj.word.entity.Writes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName WriteMapper
 * @Description
 * @Author 周佳良
 * @Date 2020/1/2 9:57
 * @Version 1.0
 **/
@Mapper
public interface WriteMapper {

    List<Word> findWordByID(@Param(value = "pnum") String pnum,
                            @Param(value = "cid") int cid);


    int addWrite(Writes write);

    List<Writes> findWritesList(@Param(value = "pnum")String pnum,
                                @Param(value = "cid")int cid,
                                @Param(value = "stuid")int stuid);
}
