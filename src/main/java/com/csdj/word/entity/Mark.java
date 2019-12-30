package com.csdj.word.entity;
/**
 * @ClassName Mark
 * @Description
 * @Author 周佳良
 * @Date 2019/12/30 8:27
 * @Version 1.0
 **/
public class Mark {
    private int mid;//分数id
    private int stuId;//引用学生表id
    private int pid; //引用试卷表id
    private int cid; //引用班级表id
    private double score; //学生分数
    private String remark; //备注
    private int isFlag;//发送家长 1是 0否

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(int isFlag) {
        this.isFlag = isFlag;
    }
}
