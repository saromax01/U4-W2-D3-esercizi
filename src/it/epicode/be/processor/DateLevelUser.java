package it.epicode.be.processor;

import it.epicode.be.entites.Order;
import it.epicode.be.entites.Product;

import java.time.LocalDate;
import java.util.List;

public class DateLevelUser {
    public static List<Product> dateGetLevel(List<Order> orders, LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2 && order.getOrderDate().isAfter(startDate) && order.getOrderDate().isBefore(endDate))
                .flatMap(order -> order.getProducts().stream()).toList();
    }
}
