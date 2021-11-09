package ru.simbianna.tacos.kitchen.messaging.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.simbianna.tacos.Order;
import ru.simbianna.tacos.kitchen.OrderReceiver;

//pull example
@Profile("rabbitmq-template")
@Component("templateOrderReceiver")
public class RabbitOrderReceiver implements OrderReceiver {
    private RabbitTemplate rabbit;

    @Autowired
    public RabbitOrderReceiver(RabbitTemplate rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public Order receiveOrder() {
        return (Order) rabbit.receiveAndConvert("tacocloud.order.queue");
    }


    //works only with SmartMessageConverter and Jackson2JsonMessageConverter
    /*@Override
    public Order receiveOrder() {
        return rabbit.receiveAndConvert("tacocloud.order.queue",
                new ParameterizedTypeReference<Order>() {
                });
    }*/

    //with delay example or you might put delay value in props
    /*@Override
    public Order receiveOrder() {
        return (Order) rabbit.receiveAndConvert("tacocloud.order.queue", 30000);
    }*/
}
