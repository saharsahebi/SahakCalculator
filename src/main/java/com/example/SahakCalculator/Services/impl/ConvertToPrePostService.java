package com.example.SahakCalculator.Services.impl;

import com.example.SahakCalculator.Model.QuestionModel;
import com.example.SahakCalculator.Services.CalculatorService;
import com.example.SahakCalculator.bean.Converter;

public class ConvertToPrePostService implements CalculatorService {
    @Override
    public QuestionModel calculate(String question) {
        QuestionModel answer=new QuestionModel();
        answer.setQuestion(question);
         answer.setAnswer( Converter.infixToPostFix(question));
         return  answer;
    }
    public QuestionModel calulatePost(String question)
    {
        QuestionModel answer=new QuestionModel();
        answer.setQuestion(question);
        answer.setAnswer( Converter.infixToPostFix(question));
        return  answer;
    }
    public QuestionModel calulatePre(String question)
    {
        QuestionModel answer=new QuestionModel();
        answer.setQuestion(question);
        answer.setAnswer( Converter.infixToPreFix(question).toString());
        return  answer;
    }

    public QuestionModel calculateposttopre(String question)
    {
        QuestionModel answer=new QuestionModel();
        answer.setQuestion(question);
        answer.setAnswer(Converter.convertposttopre(question));

        return  answer;
    }

    public QuestionModel calculatepretopost(String question)
    {
        QuestionModel answer=new QuestionModel();
        answer.setQuestion(question);
        answer.setAnswer(Converter.preToPost(question));

        return  answer;
    }
    public QuestionModel calculatepretoin(String question)
    {
        QuestionModel answer=new QuestionModel();
        answer.setQuestion(question);
        answer.setAnswer(Converter.pretoin(question));

        return  answer;
    }

    public QuestionModel calculateposttoin(String question)
    {
        QuestionModel answer=new QuestionModel();
        answer.setQuestion(question);
        answer.setAnswer(Converter.posttoin(question));

        return  answer;
    }




}
