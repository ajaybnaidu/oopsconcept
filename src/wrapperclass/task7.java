package wrapperclass;

import java.util.ArrayList;

public class task7 {

    public static void main(String[] args) {
        String[] tempStrings = {"36", "38", "40"};
        int[] celsiusTemps = new int[tempStrings.length];
        for (int i = 0; i < tempStrings.length; i++) {
            celsiusTemps[i] = Integer.parseInt(tempStrings[i]);
        }
        ArrayList<Double> fahrenheitTemps = new ArrayList<>();
        for (int i = 0; i < celsiusTemps.length; i++) {
            double fahrenheit = (celsiusTemps[i] * 9.0 / 5) + 32;
            fahrenheitTemps.add(fahrenheit); 
        }
        System.out.println("Celsius -> Fahrenheit");
        for (int i = 0; i < celsiusTemps.length; i++) {
            System.out.println(celsiusTemps[i] + "°C -> " + fahrenheitTemps.get(i) + "°F");
        }
    }
}

