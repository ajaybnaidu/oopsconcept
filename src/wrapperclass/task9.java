package wrapperclass;

public class task9 {

    public static void main(String[] args) {
        Double amount = null;
        try {
            double val = amount; 
            System.out.println("Unboxed value: " + val);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException during unboxing.");
        }
        double safeValue;
        if (amount == null) {
            safeValue = 0.0;
        } else {
            safeValue = amount;
        }

        System.out.println("Safe unboxed value: " + safeValue);
    }
}
