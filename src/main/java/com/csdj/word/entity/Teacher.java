package com.csdj.word.entity;

/**
 * 杨昭林
 */
public class Teacher {
    private int tid;//教师id
    private String tname;//教师姓名
    private int cid;//引用班级表id
    private String tpwd;//教师密码
    private String tphone;//教师手机号

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }
}
