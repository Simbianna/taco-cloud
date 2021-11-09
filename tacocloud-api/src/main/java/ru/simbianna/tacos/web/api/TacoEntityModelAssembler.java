package ru.simbianna.tacos.web.api;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import ru.simbianna.tacos.Taco;


public class TacoEntityModelAssembler extends RepresentationModelAssemblerSupport<Taco, TacoEntityModel> {

    public TacoEntityModelAssembler() {
        super(DesignTacoController.class, TacoEntityModel.class);
    }

    @Override
    public TacoEntityModel toModel(Taco taco) {
        return createModelWithId(taco.getId(), taco);
    }

    @Override
    public TacoEntityModel instantiateModel(Taco taco) {

        return new TacoEntityModel(taco);
    }
}
