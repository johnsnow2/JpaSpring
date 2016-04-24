package ua.danni.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.danni.entity.Courses;
import ua.danni.entity.User;
import ua.danni.repository.CoursesRepository;
import ua.danni.service.CoursesService;
import ua.danni.service.UserService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Artem on 13.04.2016.
 */
@Component
public class CoursesServiceImpl implements CoursesService {
    @PersistenceContext
    private EntityManager entityManager;


    @Autowired
    UserService userService;

    @Autowired
    private CoursesRepository coursesRepository;

    @Override
    public Courses addCourses(Courses courses) {
        User user = userService.getById(1);
        courses.setUserByIdProfessor(user);
        Courses savedCourses = coursesRepository.saveAndFlush(courses);

        return savedCourses;
    }

    @Override
    public void delete(int id) {
        coursesRepository.delete(id);
    }

  @Override
    public Courses getById(int idcourse) {
        return entityManager.find(Courses.class,idcourse);
    }

    @Override
    public Courses editCourses(Courses courses) {
        return coursesRepository.saveAndFlush(courses);
    }

    @Override
    public List<Courses> getAll() {
        return coursesRepository.findAll();
    }
}
