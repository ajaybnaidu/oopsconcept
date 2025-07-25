
class Book {
 String title;
 String author;
 double price;
 void displayDetails() {
 System.out.println("Title: " + title);
 System.out.println("Author: " + author);
 System.out.println("Price: ₹" + price);
 }
}
public class task1 {
 public static void main(String[] args) {
 Book b1 = new Book();
 b1.title = "Java Fundamentals";
 b1.author = "S.Shankar";
 b1.price = 450.0;
 Book b2 = new Book();
 b2.title = "Advanced Java";
 b2.author = "Kim jong un";
 b2.price = 799.0;
 b1.displayDetails();
 b2.displayDetails();
 }
}
