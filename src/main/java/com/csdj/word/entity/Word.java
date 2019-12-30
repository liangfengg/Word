package com.csdj.word.entity;
/**
*杨昭林
 */
public class Word {
    /**
     * `wordid` int(4) NOT NULL AUTO_INCREMENT COMMENT '单词序号',
     `wordmeaning` varchar(50) DEFAULT NULL COMMENT '汉语意思',
     `word` varchar(50) DEFAULT NULL COMMENT '单词',
     PRIMARY KEY (`wordid`)
     ) ENGINE=InnoDB DEFAULT CHARSET=latin1

     */

    private int wordid; //单词序号
    private String wordmeaning; //汉语意思
    private String word; //单词

    public int getWordid() {
        return wordid;
    }

    public void setWordid(int wordid) {
        this.wordid = wordid;
    }

    public String getWordmeaning() {
        return wordmeaning;
    }

    public void setWordmeaning(String wordmeaning) {
        this.wordmeaning = wordmeaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


}
