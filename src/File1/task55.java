package File1;

public class task55 {
    public static void main(String[] args) {
       
        if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }

        String input = args[0];
        String reversed = "";

        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

       
        System.out.println("Reversed string: " + reversed);
    }
}

