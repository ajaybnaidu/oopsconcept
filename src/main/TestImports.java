package main;

import com.utils.MathUtils;


import static com.utils.MathUtils.PI;
import static com.utils.MathUtils.square;

public class TestImports {
    public static void main(String[] args) {
        System.out.println("Value of PI: " + PI);
        System.out.println("Square of 5: " + square(5));
        System.out.println("Square of 3 using class: " + MathUtils.square(3));
    }
}
