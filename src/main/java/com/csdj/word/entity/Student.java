package com.csdj.word.entity;

/**
 * 杨昭林
 */
public class Student {

    private int stuid; //学生id
    private String stuname; //学生姓名
    private String stupwd; //学生密码
    private String stuphone; //学生手机号
    private String parphone; //家长手机号
    private int cid; //引用班级表id

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
