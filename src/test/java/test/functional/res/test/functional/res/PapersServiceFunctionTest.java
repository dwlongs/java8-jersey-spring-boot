package test.functional.res.test.functional.res;

import com.thoughtworks.gaia.GaiaApplication;
import com.thoughtworks.gaia.common.constant.EnvProfile;
import com.thoughtworks.gaia.common.exception.NotFoundException;
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
public class PapersServiceFunction {
    @Autowired
    private PapersService papersService;
    public ExpectedException expectedException= ExpectedException.none();
    @Autowired
    //private PaperDao paperDao;

    @Test
    public void should_get_exception_when_user_id_not_exist() {
        //given
        long userId = 1;

        //when
       /* UsersService userService = mock(UsersService.class);
        when(userService.getUser(userId)).thenReturn(null);*/

        //then
        expectedException.expect(NotFoundException.class);
        throw new NotFoundException();
        //expectedException.expectMessage("");
        //papersService.validateUserId(userId);
    }

    private UserModel generateDummyUser() {
        UserModel userModel = new UserModel();
        userModel.setName("Dog");
        userModel.setEmail("dog@zoo.com");
        userModel.setType(1);
        return userModel;
    }
}
