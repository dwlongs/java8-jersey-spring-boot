package com.thoughtworks.gaia.exam.service;

import com.thoughtworks.gaia.exam.ExamMapper;
import com.thoughtworks.gaia.exam.dao.ExamDao;
import com.thoughtworks.gaia.exam.entity.Exam;
import com.thoughtworks.gaia.exam.model.ExamModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hliang on 15/12/2016.
 */
@Component
@Transactional
public class ExamService {
    @Autowired
    private ExamDao examDao;

    @Autowired
    private ExamMapper examMapper;

    public Long addExam (Exam exam) {
        ExamModel examModel = examMapper.map(exam,ExamModel.class);
        examDao.save(examModel);
        return examModel.getId();
    }
}
