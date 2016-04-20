package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import ua.danni.entity.Courses;

@Component
public interface CoursesRepository extends JpaRepository<Courses, Integer> {
    //@Query("select b from Couses b where b.name = :name")
    //findByName(@Param("name") String name);

       //Courses findByName(String name);


}