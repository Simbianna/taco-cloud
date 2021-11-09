package ru.simbianna.tacos.messaging;

import org.apache.activemq.artemis.jms.client.ActiveMQQueue;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import ru.simbianna.tacos.Order;

import javax.jms.Destination;
import java.util.HashMap;
import java.util.Map;

@SpringBootConfiguration
public class MessagingConfig {

    //alternative to props
    @Bean
    public Destination orderQueue() {
        return new ActiveMQQueue("tacocloud.order.queue");
    }


    //Standard converter allows to convert only Serializable objects
    //Custom converter helps to avoid restrictions

    @Bean
    public MappingJackson2MessageConverter messageConverter() {
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setTypeIdPropertyName("_typeId"); //enables the receiver to know what type to convert an incoming message to

        Map<String, Class<?>> typeIdMappings = new HashMap<>();
        typeIdMappings.put("order", Order.class);
        messageConverter.setTypeIdMappings(typeIdMappings);

        return messageConverter;
    }

}
