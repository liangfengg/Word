package com.csdj.word.service.impl;

import com.csdj.word.entity.Mark;
import com.csdj.word.mapper.MarkMapper;
import com.csdj.word.service.MarkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MarkServiceImpl
 * @Description
 * @Author 周佳良
 * @Date 2020/1/4 14:16
 * @Version 1.0
 **/
@Service
public class MarkServiceImpl implements MarkService {

    @Resource
    private MarkMapper mapper;

    @Override
    public int addMark(Mark mark) {
        return mapper.addMark(mark);
    }

    @Override
    public Mark findMarkList(String pnum, int stuId, int cid) {
        return mapper.findMarkList(pnum, stuId, cid);
    }
}
