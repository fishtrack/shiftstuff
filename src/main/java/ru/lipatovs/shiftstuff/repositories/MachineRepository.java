package ru.lipatovs.shiftstuff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lipatovs.shiftstuff.entity.Machine;

public interface MachineRepository extends JpaRepository<Machine, Integer> {
}
