package com.example.SahakCalculator.Model;

public class Equation {
    private String function;
    private String numbersToset;
    private String answer;


    Equation(String function,String numbersToset)
    {
        this.function=function;
        this.numbersToset=numbersToset;
    }
    public Equation()
    {

    }
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

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
        this.numbersToset ="F"+ numbersToset;
    }
}
