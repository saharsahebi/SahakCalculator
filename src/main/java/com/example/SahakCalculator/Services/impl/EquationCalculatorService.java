package com.example.SahakCalculator.Services.impl;

import com.example.SahakCalculator.Model.Equation;
import com.example.SahakCalculator.bean.EquationsCalculator;

public class EquationCalculatorService  {

    public Equation calulate(Equation equation)
    {
        EquationsCalculator equationsCalculator=new EquationsCalculator();
        equation.setAnswer(equationsCalculator.Calculate(equation));
        System.out.println("Function:"+equation.getFunction());
        System.out.println("Numbers ToSEt:"+equation.getNumbersToset());
        System.out.println("Answer:"+equation.getAnswer());
        return equation;
    }

}
