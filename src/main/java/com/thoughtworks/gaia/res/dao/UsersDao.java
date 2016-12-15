package com.thoughtworks.gaia.res.dao;

import com.thoughtworks.gaia.common.jpa.BaseDaoWrapper;
import com.thoughtworks.gaia.res.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UsersDao extends BaseDaoWrapper<UserModel> {
    public UsersDao () {
        super(UserModel.class);
    }
}
