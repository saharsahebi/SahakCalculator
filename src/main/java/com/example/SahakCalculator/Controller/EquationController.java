package com.example.SahakCalculator.Controller;

import com.example.SahakCalculator.Model.Equation;
import com.example.SahakCalculator.Model.QuestionModel;
import com.example.SahakCalculator.Services.impl.EquationCalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EquationController {
    private EquationCalculatorService equationCalculatorService;

    EquationController()
    {
        equationCalculatorService=new EquationCalculatorService();
    }

    @GetMapping("/equation")
    public String sendAddress(Equation equation)
    {
        System.out.println("I Got it in sendAddress method ");
        return "EquationPage";
    }

    @RequestMapping("/equanswer")
    public String onevariable(Model model, Equation equation)
    {
        System.out.println("hiii");
        Equation equation1=new Equation();
        equation1=equationCalculatorService.calulate(equation);
        model.addAttribute("equation1",equation1);

        return "EquationAnswerPage";
    }






}
