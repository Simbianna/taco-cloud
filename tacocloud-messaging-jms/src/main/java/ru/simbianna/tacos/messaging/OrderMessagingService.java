package ru.simbianna.tacos.messaging;


import ru.simbianna.tacos.Order;

public interface OrderMessagingService {

    void sendOrder(Order order);
}
