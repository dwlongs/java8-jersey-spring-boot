package com.thoughtworks.gaia.res.service;

import com.thoughtworks.gaia.res.ExamMapper;
import com.thoughtworks.gaia.res.dao.ExamDao;
import com.thoughtworks.gaia.res.entity.Exam;
import com.thoughtworks.gaia.res.model.ExamModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    public ExamModel addExam (Exam exam) {
        ExamModel examModel = examMapper.map(exam,ExamModel.class);
        examDao.save(examModel);
        return examModel;
    }

    public Exam getExam(long examId) {
        throw new NotImplementedException();
    }
}
