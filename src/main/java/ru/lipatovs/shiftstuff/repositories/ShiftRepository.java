package ru.lipatovs.shiftstuff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lipatovs.shiftstuff.entity.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Integer> {
}
