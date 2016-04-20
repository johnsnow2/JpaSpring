package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ua.danni.entity.Banlist;

@Component
public interface  BanlistRepository extends JpaRepository<Banlist, Integer> {
}