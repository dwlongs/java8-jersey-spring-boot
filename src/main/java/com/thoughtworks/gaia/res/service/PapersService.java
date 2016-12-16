package com.thoughtworks.gaia.res.service;

import com.thoughtworks.gaia.common.exception.BaseResponseException;
import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.exam.service.ExamService;
import com.thoughtworks.gaia.res.entity.User;
import com.thoughtworks.gaia.res.model.UserModel;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Created by jjnzhang on 12/15/16.
 */
@Component
@Transactional
public class PapersService {
    @Autowired
    private UsersService usersService;

    @Autowired
    private ExamService examsService;

    public void SetUsersService(UsersService usersService)
    {
        this.usersService = usersService;
    }

    public User addPaper(long userId, long examId) {

        validateUserId(userId);

        return null;
    }

    public void validateUserId(long userId) {
        User user = usersService.getUser(userId);
        if (user.getType() == 1) {
            throw new NotFoundException();
        }
    }
}
