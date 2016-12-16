package com.thoughtworks.gaia.res.service;

import com.exmertec.yaz.query.EqualQuery;
import com.thoughtworks.gaia.common.Loggable;
import com.thoughtworks.gaia.product.ProductMapper;
import com.thoughtworks.gaia.res.Utils;
import com.thoughtworks.gaia.res.dao.UsersDao;
import com.thoughtworks.gaia.res.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wldu on 12/15/16.
 */
public class LoginService implements Loggable {

    @Autowired
    private ProductMapper mapper;

    @Autowired
    private UsersDao usersDao;

    public boolean authentication(String email, String password) {
        UserModel userModel = (UserModel) usersDao.where(new EqualQuery("email", email));
        String md5Password = Utils.calcMD5(password);
        if (md5Password.compareTo("test")) {
            return false;
        }


        return false;
    }
}
