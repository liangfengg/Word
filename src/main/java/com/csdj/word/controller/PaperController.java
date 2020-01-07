package com.csdj.word.controller;

import com.alibaba.fastjson.JSON;
import com.csdj.word.entity.*;
import com.csdj.word.service.PaperService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName PaperController
 * @Description
 * @Author 周佳良
 * @Date 2019/12/31 8:30
 * @Version 1.0
 **/
@Controller
public class PaperController {

    @Resource
    private PaperService service;

    @RequestMapping(value = "makePaper")
    public String makePaper(HttpSession session) {
        String tname = (String) session.getAttribute("tname");
        session.setAttribute("tname", tname);
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String nowDate = df.format(new Date());// new Date()为获取当前系统时间
        session.setAttribute("nowDate", nowDate);
        return "paper/makePaper";
    }

    @RequestMapping(value = "examList")
    public String examList() {
        return "paper/examList";
    }

    @ResponseBody
    @RequestMapping(value = "wordList")
    public Object wordList(HttpSession session) {
        List<Word> wordList = service.findWordList();
        session.setAttribute("wordList", wordList);
        return wordList;
    }

//    public String findPaperList(@RequestParam(value = "pnum",required = false) String pnum,
//                                @RequestParam(value = "cid",required = false) int cid,HttpSession session){
//        List<Paper> paperList = service.findPaperList(pnum,cid);
//        session.setAttribute("paperList", paperList);
//        return "write/write";
//    }

    @ResponseBody
    @RequestMapping(value = "addPaper")
    public Object addPaper(int[] wordId, Paper paper, HttpSession session) {
        int i = 0;
        for (int j = 0; j < wordId.length; j++) {
            int wordid = wordId[i];
            paper.setWordId(wordid);
            service.addPaper(paper);
            i++;
        }
        return JSON.toJSONString(i);
    }

    @ResponseBody
    @RequestMapping(value = "findExamList")
    public Object findExamList(@RequestParam(value = "cid", required = false) int cid, HttpSession session) {
        List<Paper> list = service.findExamList(cid);
        session.setAttribute("ExamList",list);
        return JSON.toJSONString(list);
    }

    @RequestMapping(value = "historyList")
    public String historyList(){
        return "history/historyList";
    }

    @ResponseBody
    @RequestMapping(value = "findPaperMarkList")
    public Object findPaperMarkList(HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        List<Paper> list = service.findPaperMarkList(student.getCid(), student.getStuid());
        return list;
    }
}
