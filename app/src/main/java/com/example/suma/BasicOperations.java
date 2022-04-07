package com.example.suma;

interface Operations{
    String sum(double num1, double num2);
    String subtraction(double num1, double num2);
    String multiplication(double num1, double num2);
    String division(double num1, double num2);
}

final public class BasicOperations implements Operations{
    
    double result;

    public String sum(double num1, double num2){
        result = num1 + num2;
        return String.valueOf(num1 + " + " + num2 + " = " + result);
    }

    public String subtraction(double num1, double num2){
        double result = num1 - num2;
        return String.valueOf(num1 + " - " + num2 + " = " + result);
    }

    public String multiplication(double num1, double num2){
        double result = num1 * num2;
        return String.valueOf(num1 + " x " + num2 + " = " + result);
    }

    public String division(double num1, double num2){
        double result = num1/num2;
        return String.valueOf(num1 + " / " + num2 + " = " + result);
    }
}
