package com.example.SahakCalculator.bean;

import com.example.SahakCalculator.Model.Equation;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Function;
import org.mariuszgromada.math.mxparser.mXparser;

public class EquationsCalculator {

    public String Calculate(Equation equation)
    {
        System.out.println("func:"+equation.getFunction());
        Function function=new Function(equation.getFunction());
        System.out.println(equation.getNumbersToset());
        Expression expression=new Expression(equation.getNumbersToset(),function);
        mXparser.consolePrint(expression.getExpressionString());
        String result=expression.getExpressionString()+"="+expression.calculate();
        return result;
    }

}
