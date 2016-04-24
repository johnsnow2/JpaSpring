package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import ua.danni.entity.Courses;

@Component
public interface CoursesRepository extends JpaRepository<Courses, Integer> {

   // @Query("select b from Courses b where b.idCourses = :idCourses")
    //Courses findByName(@Param("name") int idCourses);



}