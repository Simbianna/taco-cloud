package ru.simbianna.tacos.kitchen.messaging.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.simbianna.tacos.kitchen.KitchenUi;
import ru.simbianna.tacos.Order;

@Profile("rabbitmq-listener")
@Component
public class OrderListener {

    private KitchenUi ui;

    @Autowired
    public OrderListener(KitchenUi ui) {
        this.ui = ui;
    }

    @RabbitListener(queues = "tacocloud.order.queue")
    public void receiveOrder(Order order) {
        ui.displayOrder(order);
    }
}
