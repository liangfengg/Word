package com.csdj.word.service;

import com.csdj.word.entity.Mark;

import java.util.List;

/**
 * @ClassName MarkService
 * @Description
 * @Author 周佳良
 * @Date 2020/1/4 14:16
 * @Version 1.0
 **/
public interface MarkService {
    int addMark(Mark mark);

    Mark findMarkList(String pnum, int stuId, int cid);
}
