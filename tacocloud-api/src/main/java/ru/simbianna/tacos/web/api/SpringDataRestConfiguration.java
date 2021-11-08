package ru.simbianna.tacos.web.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import ru.simbianna.tacos.Taco;

@Configuration
public class SpringDataRestConfiguration {
    @Bean
    public RepresentationModelProcessor<PagedModel<CollectionModel<Taco>>> tacoProcessor(EntityLinks links){
       return new RepresentationModelProcessor<PagedModel<CollectionModel<Taco>>>() {
           @Override
           public PagedModel<CollectionModel<Taco>> process(PagedModel<CollectionModel<Taco>> model) {
               model.add(
                       links.linkFor(Taco.class)
                               .slash("recent")
                               .withRel("recents"));
               return model;
           }
       };
    }
}
