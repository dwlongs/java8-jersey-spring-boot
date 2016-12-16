package test.functional.res.res;

import com.thoughtworks.gaia.GaiaApplication;
import com.thoughtworks.gaia.common.constant.EnvProfile;
import com.thoughtworks.gaia.res.Utils;
import com.thoughtworks.gaia.res.dao.UsersDao;
import com.thoughtworks.gaia.res.model.UserModel;
import com.thoughtworks.gaia.res.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wldu on 12/15/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(GaiaApplication.class)
@Rollback
@Transactional
@ActiveProfiles({EnvProfile.TEST})
public class LoginServiceFunctionalTest {

    @Autowired
    private UsersDao usersDao;

    @Test
    public void should_authentication_return_false_given_error_password() {
        UserModel userModel = dummpyUserModel();
        usersDao.save(userModel);
        String password = "test@thoughtworks.com";
        String username = "abc";
        boolean auth = new LoginService().authentication(username, password);
        assertThat(auth).isEqualTo(false);
    }

    @Test
    public void should_authentication_return_true_given_right_password() {
        UserModel userModel = dummpyUserModel();
        usersDao.save(userModel);
        String password = "test@thoughtworks.com";
        String email = "test";
        boolean auth = new LoginService().authentication(email, password);
        assertThat(auth).isEqualTo(true);
    }

    private UserModel dummpyUserModel() {
        UserModel userModel = new UserModel();
        userModel.setEmail("test@thoughtworks.com");
        userModel.setPassword(Utils.calcMD5("test"));
        return userModel;
    }
}
