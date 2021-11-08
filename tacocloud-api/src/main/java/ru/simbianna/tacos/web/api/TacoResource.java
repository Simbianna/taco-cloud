package ru.simbianna.tacos.web.api;

import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;
import ru.simbianna.tacos.Taco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Relation(value = "taco", collectionRelation = "tacos") //for json
public class TacoResource extends RepresentationModel<TacoResource> {
    private static final IngredientResourceAssembler
            ingredientAssembler = new IngredientResourceAssembler();

    @Getter
    private final String name;

    @Getter
    private final Date createdAt;

    @Getter
    private final List<IngredientResource> ingredients;

    public TacoResource(Taco taco) {
        this.name = taco.getName();
        this.createdAt = taco.getCreatedAt();
        this.ingredients = new ArrayList<>(ingredientAssembler
                .toCollectionModel(taco.getIngredients())
                .getContent());
    }
}
