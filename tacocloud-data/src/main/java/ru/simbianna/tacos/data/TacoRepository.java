package ru.simbianna.tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.simbianna.tacos.Taco;

@Repository
public interface TacoRepository extends JpaRepository<Taco, Long> {

}
