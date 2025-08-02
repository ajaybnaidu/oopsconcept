package wrapperclass;

public class task4 {

    public static void main(String[] args) {
        Integer a1 = 100;  
        Integer a2 = 100;  

        Integer b1 = new Integer(100);
        Integer b2 = new Integer(100);

        System.out.println("a1 == a2: " + (a1 == a2));    
        System.out.println("b1 == b2: " + (b1 == b2));    

        System.out.println("a1.equals(a2): " + a1.equals(a2)); 
        System.out.println("b1.equals(b2): " + b1.equals(b2)); 
    }
}

