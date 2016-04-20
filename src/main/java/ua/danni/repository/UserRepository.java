package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import ua.danni.entity.User;

@Component
public interface UserRepository  extends JpaRepository<User, Integer> {

    @Query("select b from User b where b.name = :name")
    User findByName(@Param("name") String name);

}