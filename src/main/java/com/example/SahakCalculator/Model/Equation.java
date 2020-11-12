package com.example.SahakCalculator.bean;

public class Equation {
    private String function;
    private String numbersToset;

    public Equation()
    {}

    public String getFunction() {
        return function;
    }

    public String getNumbersToset() {
        return numbersToset;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setNumbersToset(String numbersToset) {
        this.numbersToset = numbersToset;
    }
}
