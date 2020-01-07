package com.csdj.word.entity;

public class Student {
    private int stuid;
    private String stuname;
    private String stupwd;
    private String stuphone;
    private String parphone;
    private int cid;

    private StuClass stuclass;

    public StuClass getStuclass() {
        return stuclass;
    }

    public void setStuclass(StuClass stuclass) {
        this.stuclass = stuclass;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStupwd() {
        return stupwd;
    }

    public void setStupwd(String stupwd) {
        this.stupwd = stupwd;
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone;
    }

    public String getParphone() {
        return parphone;
    }

    public void setParphone(String parphone) {
        this.parphone = parphone;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
