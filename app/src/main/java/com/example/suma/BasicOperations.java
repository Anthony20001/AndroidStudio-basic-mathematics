package com.example.suma;

interface Operations{
    double sum(double num1, double num2);
    double subtraction(double num1, double num2);
    double multiplication(double num1, double num2);
    double division(double num1, double num2);
}

final public class BasicOperations implements Operations{
    
    double result;

    public double sum(double num1, double num2){
        result = num1 + num2;
        return result;
    }

    public double subtraction(double num1, double num2){
        double result = num1 - num2;
        return result;
    }

    public double multiplication(double num1, double num2){
        double result = num1 * num2;
        return result;
    }

    public double division(double num1, double num2){
        double result = num1/num2;
        return result;
    }
}
