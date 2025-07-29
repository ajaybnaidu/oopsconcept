package CaseStudy;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal(); 
    }

    private double calculateTotal() {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice(); 
        }
        return sum;
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        customer.displayCustomer();
        for (Product p : products) {
            p.displayDetails();
        }
        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);
        payment.amount = discounted;
        payment.processPayment();
    }
}
