package com.csdj.word.service;

import com.csdj.word.entity.Word;
import com.csdj.word.entity.Writes;

import java.util.List;

/**
 * @ClassName WriteService
 * @Description
 * @Author 周佳良
 * @Date 2020/1/2 10:12
 * @Version 1.0
 **/
public interface WriteService {


    List<Word> findWordByID(String pnum, int cid);

    int addWrite(Writes write);

    List<Writes> findWritesList(String pnum,int cid,int stuid);
}
