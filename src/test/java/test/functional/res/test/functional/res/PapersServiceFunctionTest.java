package test.functional.res.test.functional.res;

import com.thoughtworks.gaia.GaiaApplication;
import com.thoughtworks.gaia.common.constant.EnvProfile;
import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.exam.service.ExamService;
import com.thoughtworks.gaia.res.dao.UsersDao;
import com.thoughtworks.gaia.res.entity.User;
import com.thoughtworks.gaia.res.model.UserModel;
import com.thoughtworks.gaia.res.service.PapersService;
import com.thoughtworks.gaia.res.service.UsersService;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import test.functional.res.UsersServiceFunctionTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by jjnzhang on 12/15/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(GaiaApplication.class)
@Rollback
@Transactional
@ActiveProfiles({EnvProfile.TEST})
public class PapersServiceFunctionTest {
    @Autowired
    private PapersService papersService;

    //@Autowired
    //private PaperDao paperDao;

    @Test(expected = NotFoundException.class)
    public void should_get_exception_when_user_id_not_exist() {
        //given
        long userId = 1;

        //when
        UsersService usersService = mock(UsersService.class);
        when(usersService.getUser(userId)).thenThrow(new NotFoundException());
        papersService.SetUsersService(usersService);

        //then
        papersService.validateUserId(userId);
    }

    @Test(expected = NotFoundException.class)
    public void should_get_exception_when_user_id_admin() {
        //given
        long userId = 1;
        User user = generateDummyUser();

        //when
        UsersService usersService = mock(UsersService.class);
        when(usersService.getUser(userId)).thenReturn(user);
        papersService.SetUsersService(usersService);

        //then
        papersService.validateUserId(userId);
    }

    @Test(expected = NotFoundException.class)
    public void should_get_exception_when_exam_id_not_exist() {
        //given
        long examId = 1;

        //when
        ExamService examService = mock(ExamService.class);
        when(examService.getExam(examId)).thenThrow(new NotFoundException());
    /*    papersService.SetUsersService(usersService);

        //then
        papersService.validateUserId(userId);*/
    }

    private User generateDummyUser() {
        User user = new User();
        user.setName("Tony");
        user.setEmail("Tony@126.com");
        user.setType(1);
        return user;
    }
}
