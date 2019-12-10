package ru.lipatovs.shiftstuff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lipatovs.shiftstuff.entity.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
