package it.epicode.be.processor;

import it.epicode.be.entites.Product;

import java.util.List;

public class BabyProcessor {

    public static List<Product> getBabyList(List<Product> products) {
        return products.stream()
                .filter(product -> product.getCategory().equals("Baby")).toList();
    }
}
