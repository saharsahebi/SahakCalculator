package com.example.SahakCalculator.Controller;

import com.example.SahakCalculator.bean.Calculator;
import com.example.SahakCalculator.bean.QuestionModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainPageController {

    @GetMapping("/maincal")
    public String sendForm(QuestionModel question) {
        System.out.println("I got it");
        return "mainPage";
    }

   @GetMapping("/intoposorpre")
    public String sendIntoPForm(QuestionModel question)
    {
        System.out.println("I Got it");
        return "convertPage";
    }

    @RequestMapping("/convertcon")
    public String convert(Model model,QuestionModel question)
    {

      return "answerPage";
    }

    @GetMapping("/equation")



    @RequestMapping("/answercon")
    public String showAnswer(Model model,QuestionModel question) throws Exception {
        Calculator myCalc = new Calculator(question.getQuestion());
        String ans= myCalc.print();
        QuestionModel answer=new QuestionModel();
        answer.setAnswer(ans);
        model.addAttribute("answer",answer);
        return  "answerPage";
    }





}
