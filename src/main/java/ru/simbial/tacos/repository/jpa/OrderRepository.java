package ru.simbial.tacos.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.simbial.tacos.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
