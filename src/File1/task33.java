package File1;

public class task33 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "! Welcome to Java.");
        } else {
            System.out.println("Please provide your name as a command-line argument.");
        }
    }
}
