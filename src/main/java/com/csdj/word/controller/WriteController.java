package com.csdj.word.controller;

import com.csdj.word.entity.*;
import com.csdj.word.service.MarkService;
import com.csdj.word.service.PaperService;
import com.csdj.word.service.WriteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName WriteController
 * @Description
 * @Author 周佳良
 * @Date 2020/1/2 10:12
 * @Version 1.0
 **/
@Controller
public class WriteController {

    @Resource
    private WriteService service;

    @Resource
    private WriteService writeService;

    @Resource
    private PaperService paperService;

    @Resource
    private MarkService markService;

    @RequestMapping(value = "writeShow")
    public String writeShow(@RequestParam(value = "pnum", required = false) String pnum,
                            @RequestParam(value = "cid", required = false) int cid,
                            @RequestParam(value = "endDate") String endDate,
                            HttpSession session) {
        session.setAttribute("pnum", pnum);
        session.setAttribute("endDate", endDate);
        List<Word> wordList = service.findWordByID(pnum, cid);
        session.setAttribute("wordList", wordList);
        Student student = (Student) session.getAttribute("student");
        int stuId = student.getStuid();
        Mark mark = markService.findMarkList(pnum, stuId, cid);
        if (mark != null) {
            session.setAttribute("flag", 1);
            session.setAttribute("mark", mark.getScore());
            return "write/write";
        } else {
            session.setAttribute("flag", 0);
            return "write/write";
        }
    }

//    @ResponseBody
//    @RequestMapping(value = "findWordByID", produces = "text/json;charset=utf-8")
//    private String findWordByID(@RequestParam(value = "pnum",required = false) String pnum,
//                                @RequestParam(value = "cid",required = false) int cid,
//                                HttpSession session, Model model){
//        List<Word> wordList = service.findWordByID(pnum,1);
//        session.setAttribute("wordList",wordList);
//        model.addAttribute("wordList",wordList);
//        return JSON.toJSONString(wordList);
//    }

    @RequestMapping(value = "judge")
    public String judge(String[] writeword, HttpSession session) {
        List<Word> wordList = (List<Word>) session.getAttribute("wordList");
        Student student = (Student) session.getAttribute("student");
        String pnum = (String) session.getAttribute("pnum");
        int cid = student.getCid();
        int stuid = student.getStuid();
        int isright;
        List<Paper> paperList = paperService.findPaperList(pnum, cid);
        int i = 0;
        for (int j = 0; j < writeword.length; j++) {
            Writes write = new Writes();
            int pid = paperList.get(j).getPid();
            if (wordList.get(j).getWord().equals(writeword[j])) {
                isright = 1;
                write.setPid(pid);
                write.setWriteword(writeword[j]);
                write.setIsright(isright);
                write.setStuid(stuid);
                write.setCid(cid);
                writeService.addWrite(write);
                i++;
            } else {
                isright = 0;
                write.setPid(pid);
                write.setWriteword(writeword[j]);
                write.setIsright(isright);
                write.setStuid(stuid);
                write.setCid(cid);
                writeService.addWrite(write);
            }
        }
        int count = 100 / writeword.length * i;
        System.err.println(count);
        session.setAttribute("flag", 1);
        session.setAttribute("mark", count);
        Mark mark = new Mark();
        mark.setCid(student.getCid());
        mark.setStuId(student.getStuid());
        mark.setPnum(pnum);
        mark.setScore(count);
        markService.addMark(mark);
        return "write/write";
    }

    @RequestMapping(value = "findWritesList")
    public String findWritesList(@RequestParam(value = "pnum",required = false) String pnum,
                                 @RequestParam(value = "cid",required = false) int cid,
                                 @RequestParam(value = "stuid",required = false) int stuid,HttpSession session){
        List<Writes> writesList = service.findWritesList(pnum,cid,stuid);
        session.setAttribute("writesList",writesList);
        return "history/solutions";
    }
}
