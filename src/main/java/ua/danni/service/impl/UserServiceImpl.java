package ua.danni.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.danni.entity.User;
import ua.danni.repository.UserRepository;
import ua.danni.service.UserService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Artem on 17.04.2016.
 */
@Service
public class UserServiceImpl implements UserService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(String login) {
        User user = new User();
        user = userRepository.findByName(login);
        //user = getByName(login);
        //String LastName = user.getName();

        //user.setLogin(login);
        try {
            user.setPassword(sha1(user.getPassword()));
        }
        catch (NoSuchAlgorithmException  e)
        {}
        //user.setPassword("d033e22ae348aeb5660fc2140aec35850c4da997");

        return user;
    }

    @Override
    public User getByName(String name) {
        return userRepository.findByName(name);
    }

    public String getOnlyName(){
        User user = new User();
        user = getByName("admin");
        String LastName = user.getName();
        return LastName;
    }

    @Override
    public User getById(int id) {
        User user = entityManager.find(User.class,1);
        return user;
    }


    public String getRole(){
        User user = new User();
        user = getByName("admin");
        String LastName = user.getName();
        return LastName;
    }



    static String sha1(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

}