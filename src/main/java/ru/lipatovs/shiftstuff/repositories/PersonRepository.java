package ru.lipatovs.shiftstuff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lipatovs.shiftstuff.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
