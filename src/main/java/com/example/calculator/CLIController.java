package com.example.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLIController {

    CalculationsController calculationsController;

    String firstOperand;

    String secondOperand;

    String result;

    String toPrint;
    public void start() {
        calculationsController = new CalculationsController();
        calculationsController.setController(this);

        toPrint = "Welcome to the Binary Calculator, I can do operations with 2 bit numbers";
        Printer.print(toPrint);

        this.calculateSum();
    }

    private void calculateSum() {
        toPrint = "Insert the first 2-bit operand";
        Printer.print(toPrint);

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstOperand = reader.readLine();

            toPrint = "Insert the second 2-bit operand";
            Printer.print(toPrint);

            secondOperand = reader.readLine();

            result = calculationsController.sum(firstOperand, secondOperand);
            toPrint = "The result is :  " + result;
            Printer.print(toPrint);

            toPrint = "restarting Calculator... \n";
            Printer.print(toPrint);

            calculateSum();

        }catch (IOException e){
            Printer.printErr();
            calculateSum();
        }

    }
}
