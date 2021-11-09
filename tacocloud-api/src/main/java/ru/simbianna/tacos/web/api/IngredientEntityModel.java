package ru.simbianna.tacos.web.api;

import lombok.Getter;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;
import ru.simbianna.tacos.Ingredient;

@Relation(value = "ingredient", collectionRelation = "ingredients") //for json
public class IngredientEntityModel extends EntityModel<IngredientEntityModel> {

    @Getter
    private String name;

    @Getter
    private Ingredient.Type type;

    public IngredientEntityModel(Ingredient ingredient) {
        this.name = ingredient.getName();
        this.type = ingredient.getType();
    }
}
