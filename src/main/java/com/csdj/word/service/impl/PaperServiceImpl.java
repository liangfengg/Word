package com.csdj.word.service.impl;

import com.csdj.word.entity.Paper;
import com.csdj.word.entity.StuClass;
import com.csdj.word.entity.Word;
import com.csdj.word.mapper.PaperMapper;
import com.csdj.word.service.PaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PaperServiceImpl
 * @Description
 * @Author 周佳良
 * @Date 2019/12/31 8:28
 * @Version 1.0
 **/
@Service
public class PaperServiceImpl implements PaperService {

    @Resource
    private PaperMapper mapper;

    @Override
    public int addPaper(Paper paper) {
        return mapper.addPaper(paper);
    }

    @Override
    public List<Word> findWordList() {
        return mapper.findWordList();
    }

    @Override
    public List<Paper> findExamList(int cid) {
        return mapper.findExamList(cid);
    }

    @Override
    public int findCount(int cid) {
        return mapper.findCount(cid);
    }

    @Override
    public List<Paper> findPaperList(String pnum, int cid) {
        return mapper.findPaperList(pnum, cid);
    }

    @Override
    public List<Paper> findPaperMarkList(int cid, int stuid) {
        return mapper.findPaperMarkList(cid, stuid);
    }

}
