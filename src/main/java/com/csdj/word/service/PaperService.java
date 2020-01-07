package com.csdj.word.service;

import com.csdj.word.entity.Paper;
import com.csdj.word.entity.StuClass;
import com.csdj.word.entity.Word;

import java.util.List;

/**
 * @ClassName PaperService
 * @Description
 * @Author 周佳良
 * @Date 2019/12/31 8:28
 * @Version 1.0
 **/
public interface PaperService {
    int addPaper(Paper paper);

    List<Word> findWordList();

    List<Paper> findExamList(int cid);

    int findCount(int cid);

    List<Paper> findPaperList(String pnum, int cid);

    List<Paper> findPaperMarkList(int cid, int stuid);
}
