package ru.simbianna.tacos.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.simbianna.tacos.model.Taco;

@Repository
public interface TacoRepository extends JpaRepository<Taco, Long> {

}
