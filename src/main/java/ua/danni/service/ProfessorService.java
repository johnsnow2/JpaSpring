package ua.danni.service;

import org.springframework.stereotype.Service;
import ua.danni.entity.User;

import java.util.List;

/**
 * Created by Artem on 23.04.2016.
 */
@Service
public interface ProfessorService {

    List<User> findProfessor();

}
