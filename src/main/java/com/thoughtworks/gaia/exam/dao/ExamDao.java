package com.thoughtworks.gaia.exam.dao;

import com.thoughtworks.gaia.common.jpa.BaseDaoWrapper;
import com.thoughtworks.gaia.exam.model.ExamModel;
import org.springframework.stereotype.Component;

/**
 * Created by hliang on 15/12/2016.
 */
@Component
public class ExamDao extends BaseDaoWrapper<ExamModel> {
    public ExamDao() {
        super(ExamModel.class);
    }
}