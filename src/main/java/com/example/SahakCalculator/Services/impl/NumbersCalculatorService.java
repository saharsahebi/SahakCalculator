package com.example.SahakCalculator.Services.impl;

import com.example.SahakCalculator.Model.QuestionModel;
import com.example.SahakCalculator.Services.CalculatorService;
import com.example.SahakCalculator.bean.Calculator;

public class NumbersCalculatorService implements CalculatorService {
    @Override
    public QuestionModel calculate(String question) {
        Calculator myCalc = new Calculator(question);
        String ans= myCalc.print();
        QuestionModel answer=new QuestionModel();
        answer.setAnswer(ans);
        return answer;
    }
}
