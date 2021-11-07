package ru.simbianna.tacos.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.simbianna.tacos.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
