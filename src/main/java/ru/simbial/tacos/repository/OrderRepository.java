package ru.simbial.tacos.repository;

import ru.simbial.tacos.Order;

public interface OrderRepository {

    Order save(Order order);
}
