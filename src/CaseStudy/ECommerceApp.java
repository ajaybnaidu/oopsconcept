package CaseStudy;

import java.util.Arrays;

public class ECommerceApp {
    public static void main(String[] args) {
     
        Product phone = new Electronics("P1001", "iPhone 15", 79999, "Apple", 12);
        Product tshirt = new Clothing("C1002", "Polo T-shirt", 1499, "L", "Cotton");
        Customer customer = new Customer("Ravi Kumar", "ravi@example.com");
        Order order = new Order(customer, Arrays.asList(phone, tshirt));
        Discountable discount = (price) -> price * 0.9;
        Payment payment = new UpiPayment(0, "ravi@upi");
        order.placeOrder(payment, discount);
    }
}
