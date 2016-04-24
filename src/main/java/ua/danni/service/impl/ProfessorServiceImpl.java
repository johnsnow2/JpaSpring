package ua.danni.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.danni.entity.User;
import ua.danni.repository.UserRepository;
import ua.danni.service.ProfessorService;

import java.util.List;

/**
 * Created by Artem on 23.04.2016.
 */
@Component
public class ProfessorServiceImpl implements ProfessorService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findProfessor() {
        return userRepository.findProfessor(2);
    }
}
