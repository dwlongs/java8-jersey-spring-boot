package com.thoughtworks.gaia.exam.entity;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

/**
 * Created by hliang on 15/12/2016.
 */
@Component
public class Exam {
    private Long id;
    private String name;

    private DateTime startTime;
    private DateTime endTime;

    private Integer logicNum;
    private Integer programNum;

    private Integer state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getLogicNum() {
        return logicNum;
    }

    public void setLogicNum(Integer logicNum) {
        this.logicNum = logicNum;
    }

    public Integer getProgramNum() {
        return programNum;
    }

    public void setProgramNum(Integer programNum) {
        this.programNum = programNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
