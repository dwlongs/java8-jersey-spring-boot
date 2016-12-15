package com.thoughtworks.gaia.exam.model;

import com.thoughtworks.gaia.common.jpa.IdBaseModel;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by hliang on 15/12/2016.
 */

@Entity
@Table(name = "EXAM")
public class ExamModel extends IdBaseModel {
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "time_start", nullable = false)
    private DateTime timeStart;

    @Column(name = "time_end", nullable = false)
    private DateTime timeEnd;

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

    public DateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(DateTime timeStart) {
        this.timeStart = timeStart;
    }

    public DateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(DateTime timeEnd) {
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
