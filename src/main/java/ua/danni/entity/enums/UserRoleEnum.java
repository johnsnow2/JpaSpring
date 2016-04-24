package ua.danni.entity.enums;

import ua.danni.entity.User;

/**
 * Created by Artem on 17.04.2016.
 */
public enum UserRoleEnum {

    ADMIN,
    USER,
    PROFESSOR;

    public static UserRoleEnum getRole(User user) {
        int roleId = user.getIdRole();
        return UserRoleEnum.values()[roleId];
    }

    public String getName() {
        return name();
    }

}