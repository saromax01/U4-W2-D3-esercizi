import it.epicode.be.entites.Customer;
import it.epicode.be.entites.Order;
import it.epicode.be.entites.Product;
import it.epicode.be.processor.BabyProcessor;
import it.epicode.be.processor.BookProcessor;
import it.epicode.be.processor.DateLevelUser;
import it.epicode.be.processor.DiscountBoys;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Product> products = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("esercizi-w4-d3");
        Product book = new Product(12345545, "Harry", "Book",110.50);
        Product book2 = new Product(12345547, "Potter", "Book",110.50);
        Product barbie = new Product(12345548, "Barbie", "Baby",22.99);
        Product can = new Product(12345549, "Can", "Baby",17.50);
        Product dogToys = new Product(12345569, "ball", "Boys",20);
        Product horseToys = new Product(12345599, "spurs", "Boys",50);
        Product maskSpiderman = new Product(12345579, "Spiderman-Mask", "Boys",50);
        Product maskBatman = new Product(12345534, "BatMan-Mask", "Boys",50);

        Customer customer = new Customer(34569876, "Ethan", 2);
         LocalDate orderDate = LocalDate.of(2021,3,27);
         Order order1 = new Order(909105643,"complete",orderDate,orderDate.plusDays(5), List.of(maskSpiderman,maskBatman),customer);
        LocalDate startDate = LocalDate.of(2021,2,1);
        LocalDate endDate = LocalDate.of(2021,4,21);




        products.add(book);
        products.add(book2);
        products.add(barbie);
        products.add(can);
        products.add(dogToys);
        products.add(horseToys);
        products.add(maskSpiderman);
        products.add(maskBatman);
        orders.add(order1);


        System.out.println("esercizio1");
        BookProcessor.getProductsBooks(products).forEach(System.out::println);
        System.out.println("esercizio2");
        BabyProcessor.getBabyList(products).forEach(System.out::println);
        System.out.println("esercizio3");
        DiscountBoys.discountProductsBoys(products).forEach(System.out::println);
        System.out.println("esercizio 4");
        DateLevelUser.dateGetLevel(orders,startDate,endDate).forEach(System.out::println);


    }


}