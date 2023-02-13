package com.example.calculator;

import java.io.IOException;

public class CalculationsController {

    CLIController cliController;
    public void setController(CLIController cliController) {
        this.cliController = cliController;
    }


    public String calculateSum(String firstOperand, String secondOperand){

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = firstOperand.length() - 1;
        int j = secondOperand.length() - 1;
        int sum;

        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) {
                sum += firstOperand.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += secondOperand.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();}

    public String sum(String firstOperand, String secondOperand) throws IOException {


        if(this.validation(firstOperand) && this.validation(secondOperand)) {
            if(firstOperand.length() == secondOperand.length()){

                return calculateSum(firstOperand, secondOperand);

            }else {
                throw new IOException();
            }

        }else {
            throw new IOException();
        }

    }

    private boolean validation(String operand) {
        if(operand.isEmpty()){
            return false;
        }

        for (int i = 0; i < operand.length(); i++) {
            char c = operand.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
