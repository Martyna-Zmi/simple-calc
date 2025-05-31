package org.example;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Calculator {
    public static float add(float a, float b){
       return a + b;
    }
    public static float subtract(float a, float b){
        return a - b;
    }
    public static boolean areEqual(float a, float b){
        return a == b;
    }

    public static String findGreater(float a, float b){
        if (areEqual(a, b)) return a + " and " + b + " are equal";
        return (Math.max(a, b)) + " is greater";
    }
}
