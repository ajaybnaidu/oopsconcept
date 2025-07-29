package file1;

public class task77 {
    

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        obj.displayDefaults();
    }

}
class DefaultValues{
	int intVar;
    float floatVar;
    double doubleVar;
    boolean booleanVar;
    char charVar;
    String stringVar;

	public void displayDefaults() {
        System.out.println("Default int: " + intVar);
        System.out.println("Default float: " + floatVar);
        System.out.println("Default double: " + doubleVar);
        System.out.println("Default boolean: " + booleanVar);
        System.out.println("Default char: [" + charVar + "]");
        System.out.println("Default String: " + stringVar);
		
	}
	
}
