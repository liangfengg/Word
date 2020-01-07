package com.csdj.word.controller;

import com.csdj.word.entity.Student;
import com.csdj.word.service.PaperService;
import com.csdj.word.service.StuService;
import com.csdj.word.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Resource
    private TeacherService service;

    @Resource
    private PaperService paperService;
    @Resource
    private StuService stuService;

    @RequestMapping(value = "login")
    public String login() {
        return "user/login";
    }

    @RequestMapping(value = "main")
    public String main() {
        return "user/main";
    }

    @RequestMapping("loginExit.do")
    public String loginExit(HttpSession session) {
        session.invalidate();
        return "redirect:login";
    }

    @RequestMapping(value = "login.do")
    public String login(@RequestParam(value = "tname") String tname,
                        @RequestParam(value = "tpwd") String tpwd,
                        @RequestParam(value = "role") int role,
                        HttpSession session) {
        if (role == 1) {
            int i = service.login(tname, tpwd);
            if (i > 0) {
                session.setAttribute("tname", tname);
                session.setAttribute("tpwd", tpwd);
                return "user/index";
            }
            return "user/login";
        } else if (role == 2) {
            Student student = stuService.stuLogin(tname);
            if (student != null) {
                if (student.getStupwd().equals(tpwd)) {
                    session.setAttribute("student", student);
                    int count = paperService.findCount(student.getCid());
                    session.setAttribute("count", count);
                    return "paper/examList";
                }
            }
            return "user/login";
        } else {
            return "user/login";
        }
    }

    @RequestMapping(value = "changePwd")
    public String changePwd(HttpSession session) {
        String tname = (String) session.getAttribute("tname");
        String tpwd = (String) session.getAttribute("tpwd");
        session.setAttribute("tname", tname);
        session.setAttribute("tpwd", tpwd);
        return "user/changePwd";
    }
}
