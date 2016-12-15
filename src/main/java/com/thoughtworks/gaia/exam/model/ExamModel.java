package com.thoughtworks.gaia.exam.model;

import com.thoughtworks.gaia.common.jpa.IdBaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by hliang on 15/12/2016.
 */

@Entity
@Table(name = "EXAM")
public class ExamModel extends IdBaseModel {
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "start_time", nullable = false)
    private Date timeStart;

    @Column(name = "end_time", nullable = false)
    private Date timeEnd;

    @Column(name = "logic_num", nullable = false)
    private Integer logicNum;

    @Column(name = "program_num", nullable = false)
    private Integer programNum;

    @Column(name = "state", nullable = false)
    private Integer state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
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
