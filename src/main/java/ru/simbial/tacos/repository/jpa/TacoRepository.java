package ru.simbial.tacos.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.simbial.tacos.model.Taco;

@Repository
public interface TacoRepository extends JpaRepository<Taco, Long> {

}
