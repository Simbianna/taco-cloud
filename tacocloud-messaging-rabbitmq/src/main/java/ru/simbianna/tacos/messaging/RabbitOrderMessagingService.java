package ru.simbianna.tacos.messaging;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import ru.simbianna.tacos.Order;

@Service
public class RabbitOrderMessagingService implements OrderMessagingService {

    RabbitTemplate rabbit;

    public RabbitOrderMessagingService(RabbitTemplate rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public void sendOrder(Order order) {
        rabbit.convertAndSend("tacocloud.order.queue", order, message -> {
            MessageProperties messageProperties = message.getMessageProperties();
            messageProperties.setHeader("X_ORDER_SOURCE", "WEB");
            return message;
        });
    }
}
