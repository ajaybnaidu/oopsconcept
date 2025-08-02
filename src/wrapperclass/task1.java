package wrapperclass;

public class task1 {

    public static void main(String[] args) {

        int intVal = 10;
        double doubleVal = 15.75;
        char charVal = 'A';
        Integer intWrapper = Integer.valueOf(intVal);
        Double doubleWrapper = Double.valueOf(doubleVal);
        Character charWrapper = Character.valueOf(charVal);
        int intPrimitive = intWrapper.intValue();
        double doublePrimitive = doubleWrapper.doubleValue();
        char charPrimitive = charWrapper.charValue();
        System.out.println("Original int: " + intVal + " | Wrapper: " + intWrapper + " | Back to primitive: " + intPrimitive);
        System.out.println("Original double: " + doubleVal + " | Wrapper: " + doubleWrapper + " | Back to primitive: " + doublePrimitive);
        System.out.println("Original char: " + charVal + " | Wrapper: " + charWrapper + " | Back to primitive: " + charPrimitive);
    }
}
