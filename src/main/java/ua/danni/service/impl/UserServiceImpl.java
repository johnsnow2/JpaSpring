package ua.danni.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.danni.entity.User;
import ua.danni.repository.UserRepository;
import ua.danni.service.UserService;

/**
 * Created by Artem on 17.04.2016.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }

    @Override
    public User getByName(String name) {
        return userRepository.findByName(name);
    }

}