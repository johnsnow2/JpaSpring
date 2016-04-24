package ua.danni.service;

import org.springframework.stereotype.Service;
import ua.danni.entity.Courses;

import java.util.List;


@Service
public interface CoursesService {

    Courses addCourses(Courses courses);

    void delete(int id);

    Courses getById(int idcourse);

    Courses editCourses(Courses courses);

    List<Courses> getAll();

}
