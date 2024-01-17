package it.epicode.be.processor;

import it.epicode.be.entites.Product;

import java.util.List;

public class DiscountBoys {
    public static List<Product> discountProductsBoys(List<Product> products) {
        return products.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .map(product -> {
                    double discount09 = product.getPrice() * 0.9;
                    return new Product(product.getId(), product.getName(), product.getCategory(), discount09);
                })
                .toList();
    }
}
