package com.nk.service.impl;

import com.nk.dao.ILoginDao;
import com.nk.model.User;
import com.nk.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService implements ILoginService {

    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public User login(User user) {
        System.out.println("登录");
        return iLoginDao.login(user);
    }

    @Override
    public void addUser(User user) {
        System.out.println(user);
        iLoginDao.addUser(user);
    }

    @Override
    public void updatePWById(String id, String password) {
        iLoginDao.updatePWById(id,password);
    }
}
