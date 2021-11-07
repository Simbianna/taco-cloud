package ru.simbianna.tacos.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.simbianna.tacos.model.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String> {

}
