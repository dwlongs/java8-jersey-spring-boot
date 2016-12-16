package com.thoughtworks.gaia.res.service;

import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.res.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
