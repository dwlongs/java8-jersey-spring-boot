package test.functional.res;

import com.thoughtworks.gaia.GaiaApplication;
import com.thoughtworks.gaia.common.constant.EnvProfile;
import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.res.dao.UsersDao;
import com.thoughtworks.gaia.res.entity.User;
import com.thoughtworks.gaia.res.model.UserModel;
import com.thoughtworks.gaia.res.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(GaiaApplication.class)
@Rollback
@Transactional
@ActiveProfiles({EnvProfile.TEST})
public class UsersServiceFunctionTest {
    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersDao usersDao;

    @Test
    public void should_get_user_with_id() {
        //given
        UserModel userModel = generateDummyUserModel();
        //when
        usersDao.save(userModel);
        long userId = userModel.getId();
        //then
        User user = usersService.getUser(userId);
        assertThat(user.getId()).isEqualTo(userId);

    }

    private UserModel generateDummyUserModel() {
        UserModel userModel = new UserModel();
        userModel.setName("Dog");
        userModel.setEmail("dog@zoo.com");
        return userModel;
    }

    @Test(expected = NotFoundException.class)
    public void should_throw_exception_when_not_found() {
        usersService.getUser(-1L);
    }
}
