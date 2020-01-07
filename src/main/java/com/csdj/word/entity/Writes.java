package com.csdj.word.entity;

/**
 * 杨昭林
 */
public class Writes {
    private int writeid;  //默写表id
    private int pid; //引用试卷表id
    private String writeword; //默写的单词
    private int isright; //默写是否正确 1是 0否
    private String writedate; //默写日期
    private int stuid; //引用学生表id
    private int cid; //引用班级表id
    private Word word;

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public int getWriteid() {
        return writeid;
    }

    public void setWriteid(int writeid) {
        this.writeid = writeid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getWriteword() {
        return writeword;
    }

    public void setWriteword(String writeword) {
        this.writeword = writeword;
    }

    public int getIsright() {
        return isright;
    }

    public void setIsright(int isright) {
        this.isright = isright;
    }

    public String getWritedate() {
        return writedate;
    }

    public void setWritedate(String writedate) {
        this.writedate = writedate;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }


}
