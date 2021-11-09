package ru.simbianna.tacos.kitchen.messaging.jms;

import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import ru.simbianna.tacos.kitchen.KitchenUi;
import ru.simbianna.tacos.Order;

//receives messages immediately (non-blocking). Useful only if messages are handled fast
@Profile("jms-listener")
@Component
public class OrderListener {
    private KitchenUi ui;

    public OrderListener(KitchenUi ui) {
        this.ui = ui;
    }

    @JmsListener(destination = "tacocloud.order.queue")
    public void receiveOrder(Order order){
        ui.displayOrder(order);
    }
}
