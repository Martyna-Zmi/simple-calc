package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculator!");
        System.out.println("Provide two numbers");
        System.out.println("First number:");
        float a = scanner.nextFloat();
        System.out.println("Second number:");
        float b = scanner.nextFloat();
        System.out.println(a + " + " + b + " = " + Calculator.add(a, b));
        System.out.println(a + " - " + b + " = " + Calculator.subtract(a, b));
        System.out.println(Calculator.findGreater(a, b));
    }
}