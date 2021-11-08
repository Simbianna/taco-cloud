package ru.simbianna.tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.simbianna.tacos.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String> {

}
