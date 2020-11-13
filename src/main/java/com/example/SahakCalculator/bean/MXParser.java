package com.example.SahakCalculator.bean;

import org.mariuszgromada.math.mxparser.Expression;

public class MXParser {


    public static String calculate(String question)
    {
        Expression ex=new Expression(question);
        double doubleresult=ex.calculate();
        String result=String.valueOf(doubleresult);
        return result;

    }

}
