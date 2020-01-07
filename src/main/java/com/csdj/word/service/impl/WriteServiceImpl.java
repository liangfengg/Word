package com.csdj.word.service.impl;

import com.csdj.word.entity.Word;
import com.csdj.word.entity.Writes;
import com.csdj.word.mapper.WriteMapper;
import com.csdj.word.service.WriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName WriteServiceImpl
 * @Description
 * @Author 周佳良
 * @Date 2020/1/2 10:12
 * @Version 1.0
 **/
@Service
public class WriteServiceImpl implements WriteService {

    @Resource
    private WriteMapper mapper;


    @Override
    public List<Word> findWordByID(String pnum, int cid) {
        return mapper.findWordByID(pnum, cid);
    }

    @Override
    public int addWrite(Writes write) {
        return mapper.addWrite(write);
    }

    @Override
    public List<Writes> findWritesList(String pnum, int cid, int stuid) {
        return mapper.findWritesList(pnum,cid,stuid);
    }
}
