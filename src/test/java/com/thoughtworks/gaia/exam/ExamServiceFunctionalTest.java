package com.thoughtworks.gaia.exam;

import com.thoughtworks.gaia.GaiaApplication;
import com.thoughtworks.gaia.common.constant.EnvProfile;
import com.thoughtworks.gaia.exam.entity.Exam;
import com.thoughtworks.gaia.exam.service.ExamService;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

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

    @Test
    public void should_get_product_with_id() throws Exception {
        exam.setName("test");
        exam.setStartTime(new DateTime(2016,12,16,0,0));
        exam.setEndTime(new DateTime(2016,12,20,0,0));
        exam.setLogicNum(12);
        exam.setProgramNum(10);
        exam.setState(0);
        examService.addExam(exam);
    }
}
