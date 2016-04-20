package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ua.danni.entity.Journal;

@Component
public interface JournalRepository  extends JpaRepository<Journal, Integer> {
}