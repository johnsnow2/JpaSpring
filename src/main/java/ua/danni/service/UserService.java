package ua.danni.service;

import ua.danni.entity.User;

/**
 * Created by Artem on 17.04.2016.
 */
public interface UserService {
    User getUser(String login);

    User getByName(String name);

    String getOnlyName();

    User getById(int id);
}
