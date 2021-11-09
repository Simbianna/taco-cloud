package ru.simbianna.tacos.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessagePostProcessor;
import org.springframework.stereotype.Service;
import ru.simbianna.tacos.Order;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;


@Service
public class JmsOrderMessagingService implements OrderMessagingService {
    private JmsTemplate jms;
    private Destination orderQueue;

    @Autowired
    public JmsOrderMessagingService(JmsTemplate jms, Destination orderQueue) {
        this.jms = jms;
        this.orderQueue = orderQueue;
    }

    @Override
    public void sendOrder(Order order) {
        jms.convertAndSend(orderQueue, order, this::addOrderSource);
    }

    private Message addOrderSource(Message message) throws JMSException {
        message.setStringProperty("X_ORDER_SOURCE", "WEB");
        return message;
    }

    /*@Override
    public void sendOrder(Order order) {
        jms.send(session -> session.createObjectMessage(order));
    }*

    /*@Override
    public void sendOrder(Order order) {
        jms.send("tacocloud.order.queue", session -> session.createObjectMessage(order));
    }*/
}
