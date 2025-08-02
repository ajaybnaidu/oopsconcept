package wrapperclass;

public class task3 {

    public static void main(String[] args) {
        String intStr = "123";
        String doubleStr = "45.67";
        String booleanStr = "true";
        int intVal = Integer.parseInt(intStr);
        double doubleVal = Double.parseDouble(doubleStr);
        boolean booleanVal = Boolean.parseBoolean(booleanStr);
        System.out.println("Converted int: " + intVal + " (Type: " + ((Object)intVal).getClass().getSimpleName() + ")");
        System.out.println("Converted double: " + doubleVal + " (Type: " + ((Object)doubleVal).getClass().getSimpleName() + ")");
        System.out.println("Converted boolean: " + booleanVal + " (Type: " + ((Object)booleanVal).getClass().getSimpleName() + ")");
    }
}
