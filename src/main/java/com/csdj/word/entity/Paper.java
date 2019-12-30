package com.csdj.word.entity;

/**
 * @ClassName Paper
 * @Description
 * @Author 周佳良
 * @Date 2019/12/30 8:30
 * @Version 1.0
 **/
public class Paper {
    private int pid;//试卷id
    private String pnum;//试卷号
    private int wordId;//引用单词表id
    private String startDate;//试卷开始时间
    private String endDate;//试卷结束时间
    private int cid;//引用班级表id
    private String userName;//出题姓名

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public int getWordId() {
        return wordId;
    }

    public void setWordId(int wordId) {
        this.wordId = wordId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
