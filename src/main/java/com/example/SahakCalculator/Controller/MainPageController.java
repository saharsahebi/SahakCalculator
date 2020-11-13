package com.example.SahakCalculator.Controller;

import com.example.SahakCalculator.Services.impl.ConvertToPrePostService;
import com.example.SahakCalculator.Services.impl.NumbersCalculatorService;
import com.example.SahakCalculator.Model.QuestionModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainPageController {
    private  NumbersCalculatorService numbersCalculatorService;
    private ConvertToPrePostService convertToPrePostService;

    MainPageController()
    {
        numbersCalculatorService=new NumbersCalculatorService();
    }

    @GetMapping("/maincal")
    public String sendForm(QuestionModel question) {
        System.out.println("I got it");
        return "mainPage";
    }

   @GetMapping("/converter")
    public String sendIntoPForm(QuestionModel question)
    {
        System.out.println("I Got it");
        return "convertPage";
    }






    @RequestMapping("/answercon")
    public String showAnswer(Model model,QuestionModel question) throws Exception {
        QuestionModel questionModel=numbersCalculatorService.calculate(question.getQuestion());

        model.addAttribute("answer",questionModel);
        return  "answerPage";
    }





}
