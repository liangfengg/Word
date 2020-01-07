package com.csdj.word.mapper;

import com.csdj.word.entity.Paper;
import com.csdj.word.entity.StuClass;
import com.csdj.word.entity.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName PaperMapper
 * @Description
 * @Author 周佳良
 * @Date 2019/12/31 8:13
 * @Version 1.0
 **/
@Mapper
public interface PaperMapper {
    int addPaper(Paper paper);

    List<Word> findWordList();

    List<Paper> findExamList(@Param(value = "cid") int cid);

    int findCount(@Param(value = "cid") int cid);

    List<Paper> findPaperList(@Param(value = "pnum") String pnum,
                              @Param(value = "cid") int cid);

    List<Paper> findPaperMarkList(@Param(value = "cid") int cid, @Param(value = "stuid") int stuid);
}
