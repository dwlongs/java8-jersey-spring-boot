package com.thoughtworks.gaia.exam;

import com.thoughtworks.gaia.GaiaApplication;
import com.thoughtworks.gaia.common.constant.EnvProfile;
import com.thoughtworks.gaia.exam.entity.Exam;
import com.thoughtworks.gaia.exam.model.ExamModel;
import com.thoughtworks.gaia.exam.service.ExamService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by hliang on 15/12/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(GaiaApplication.class)
@Rollback
@Transactional
@ActiveProfiles({EnvProfile.TEST})
public class ExamServiceFunctionalTest {
    @Autowired
    private ExamService examService;

    @Autowired
    private Exam exam;

    @Before
    public void setUp() throws Exception {
        exam.setName("test");
        exam.setStartTime(new Date());
        exam.setEndTime(new Date());
        exam.setLogicNum(12);
        exam.setProgramNum(10);
    }

    @Test
    public void should_return_1_when_inserted () throws Exception {
        ExamModel examModel = examService.addExam(exam);
        assertThat(examModel.getId()).isEqualTo(1);
    }

}
