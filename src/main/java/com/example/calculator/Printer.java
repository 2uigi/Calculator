package com.example.calculator;

public interface Printer {

    static void print(String toPrint){
        System.out.println(toPrint);
    }

    static void printErr(){
        System.err.println("An error Occurred, restarting BinaryCalculator");
    }
}
