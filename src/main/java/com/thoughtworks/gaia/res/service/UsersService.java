package com.thoughtworks.gaia.res.service;

import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.product.ProductMapper;
import com.thoughtworks.gaia.res.dao.UsersDao;
import com.thoughtworks.gaia.res.entity.User;
import com.thoughtworks.gaia.res.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UsersService {
    @Autowired
    private ProductMapper mapper;

    @Autowired
    private UsersDao usersDao;

    public User getUser(long userId) {
        UserModel userModel = usersDao.idEquals(userId).querySingle();
        if (userModel == null) {
            throw new NotFoundException();
        }
        User user = mapper.map(userModel, User.class);
        return user;
    }
}
