package ru.simbianna.tacos.web.api;


import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import ru.simbianna.tacos.Ingredient;

public class IngredientResourceAssembler extends RepresentationModelAssemblerSupport<Ingredient, IngredientResource> {

    public IngredientResourceAssembler() {
        super(IngredientController.class, IngredientResource.class);
    }

    @Override
    public IngredientResource toModel(Ingredient ingredient) {
        return createModelWithId(ingredient.getId(), ingredient);
    }

    @Override
    public IngredientResource instantiateModel(
            Ingredient ingredient) {
        return new IngredientResource(ingredient);
    }

}
