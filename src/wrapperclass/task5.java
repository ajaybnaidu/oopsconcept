package wrapperclass;

class Box<T> {
 private T value;

 public void setValue(T value) {
     this.value = value;
 }

 public T getValue() {
     return value;
 }
}

public class task5 {

 public static void main(String[] args) {
     Box<Integer> intBox = new Box<>();
     intBox.setValue(50); 
     int intValue = intBox.getValue(); 
     System.out.println("Integer value in Box: " + intValue);
     Box<Double> doubleBox = new Box<>();
     doubleBox.setValue(99.99);
     double doubleValue = doubleBox.getValue();
     System.out.println("Double value in Box: " + doubleValue);
 }
}

