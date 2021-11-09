package ru.simbianna.tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import ru.simbianna.tacos.Ingredient;

@CrossOrigin(origins="*")
public interface IngredientRepository extends JpaRepository<Ingredient, String> {

}
