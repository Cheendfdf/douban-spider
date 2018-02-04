package com.yao.douban.douban.entity.move;

/**
 * Created by 单耀 on 2018/1/30.
 */
public class Move {
    private String id;
    private String name;
    private String otherName;//又名
    private String director;//导演
    private String screenWriter;//编剧
    private String mainaAtion;//主演
    private String type;//类型
    private String flakingArea;//制片国家、地区
    private String language;//语言
    private String showDate;//上映日期
    private String length;//片长
    private String imdb;//IMDb链接
    private Double doubanScore;//豆瓣评分
    private Integer evaluationNumbe;//评价人数
    private Integer evaluationTotal;//评价总数

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScreenWriter() {
        return screenWriter;
    }

    public void setScreenWriter(String screenWriter) {
        this.screenWriter = screenWriter;
    }

    public String getMainaAtion() {
        return mainaAtion;
    }

    public void setMainaAtion(String mainaAtion) {
        this.mainaAtion = mainaAtion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlakingArea() {
        return flakingArea;
    }

    public void setFlakingArea(String flakingArea) {
        this.flakingArea = flakingArea;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public Double getDoubanScore() {
        return doubanScore;
    }

    public void setDoubanScore(Double doubanScore) {
        this.doubanScore = doubanScore;
    }

    public Integer getEvaluationNumbe() {
        return evaluationNumbe;
    }

    public void setEvaluationNumbe(Integer evaluationNumbe) {
        this.evaluationNumbe = evaluationNumbe;
    }

    public Integer getEvaluationTotal() {
        return evaluationTotal;
    }

    public void setEvaluationTotal(Integer evaluationTotal) {
        this.evaluationTotal = evaluationTotal;
    }
}