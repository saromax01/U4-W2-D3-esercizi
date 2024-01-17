package it.epicode.be.processor;

import it.epicode.be.entites.Product;

import java.util.List;

public class BookProcessor {
    public static List<Product> getProductsBooks(List<Product> products) {
        return products.stream()
                .filter(product ->  product.getCategory().equals("Book") && product.getPrice() > 100 ).toList();


    }
}