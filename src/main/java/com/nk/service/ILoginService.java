package com.nk.service;

import com.nk.model.User;
import org.springframework.stereotype.Service;

@Service
public interface ILoginService {
    User login(User user);

    void addUser(User user);

    void updatePWById(String id, String password);
}
