package com.example.SahakCalculator.Services.impl;

import com.example.SahakCalculator.Model.QuestionModel;
import com.example.SahakCalculator.Services.CalculatorService;
import com.example.SahakCalculator.bean.Calculator;
import com.example.SahakCalculator.bean.MXParser;

public class NumbersCalculatorService implements CalculatorService {
    @Override
    public QuestionModel calculate(String question) {

        String result=MXParser.calculate(question);
        QuestionModel answer=new QuestionModel();
        answer.setQuestion(question);
        answer.setAnswer(result);
        return answer;
    }
}
