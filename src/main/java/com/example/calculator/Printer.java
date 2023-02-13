package com.example.calculator;

public abstract class Printer {

    public static void print(String toPrint){
        System.out.println(toPrint);
    }

    public static void printErr(){
        System.err.println("An error Occurred, restarting BinaryCalculator");
    }
}
