package ru.simbianna.tacos.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import ru.simbianna.tacos.model.Ingredient;
import ru.simbianna.tacos.repository.jpa.IngredientRepository;

//@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private final IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }


    /*private final IngredientRepository ingredientRepo;
    private final List<Ingredient> ingredients = new ArrayList<>();

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;

        ingredientRepo.findAll().forEach(ingredients::add);
    }

    @Override
    public Ingredient convert(String ingredientId) {
        return ingredients
                .stream().filter( i -> i.getId().equals(ingredientId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Ingredient with ID '" + ingredientId + "' not found!"));
    }*/
}

