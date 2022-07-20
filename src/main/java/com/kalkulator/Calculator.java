package com.kalkulator;

public class Calculator {
    public void subtract(){
        System.out.println("subtract works!");
    }
    public void add(){
        System.out.println("add works!");
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.subtract();
        calculator.add();
    }
}
