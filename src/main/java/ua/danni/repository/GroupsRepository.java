package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ua.danni.entity.Groups;

@Component
public interface GroupsRepository extends JpaRepository<Groups, Integer> {
}