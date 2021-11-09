package ru.simbianna.tacos.web.api;


import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import ru.simbianna.tacos.Ingredient;

public class IngredientEntityModelAssembler extends RepresentationModelAssemblerSupport<Ingredient, IngredientEntityModel> {

    public IngredientEntityModelAssembler() {
        super(IngredientController.class, IngredientEntityModel.class);
    }

    @Override
    public IngredientEntityModel toModel(Ingredient ingredient) {
        return createModelWithId(ingredient.getId(), ingredient);
    }

    @Override
    public IngredientEntityModel instantiateModel(
            Ingredient ingredient) {
        return new IngredientEntityModel(ingredient);
    }

}
