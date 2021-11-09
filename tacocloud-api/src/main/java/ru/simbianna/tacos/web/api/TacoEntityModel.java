package ru.simbianna.tacos.web.api;

import lombok.Getter;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;
import ru.simbianna.tacos.Taco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Relation(value = "taco", collectionRelation = "tacos") //for json
public class TacoEntityModel extends EntityModel<TacoEntityModel> {
    private static final IngredientEntityModelAssembler
            ingredientAssembler = new IngredientEntityModelAssembler();

    @Getter
    private final String name;

    @Getter
    private final Date createdAt;

    @Getter
    private final CollectionModel<IngredientEntityModel> ingredients;

    public TacoEntityModel(Taco taco) {
        this.name = taco.getName();
        this.createdAt = taco.getCreatedAt();
        this.ingredients = ingredientAssembler.toCollectionModel(taco.getIngredients());
    }
}
