package com.example.SahakCalculator.Controller;

import com.example.SahakCalculator.Model.QuestionModel;
import com.example.SahakCalculator.Services.impl.ConvertToPrePostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConverterController {
    private ConvertToPrePostService convertToPrePostService;


    ConverterController()
    {
        convertToPrePostService=new ConvertToPrePostService();
    }


    //infix to postfix
    @RequestMapping(value="/convert", method= RequestMethod.POST, params="action=intopostfix")
    public String convertPost(Model model, QuestionModel question)
    {
        System.out.println(question.getQuestion());
        QuestionModel questionModel= convertToPrePostService.calulatePost(question.getQuestion());
        model.addAttribute("answer",questionModel);
        return "ConvertAnswerPage";
    }

    //infix to prefix
    @RequestMapping(value="/convert", method= RequestMethod.POST, params="action=intoprefix")
    public String convertPre(Model model, QuestionModel question)
    {
        System.out.println(question.getQuestion());
        QuestionModel questionModel= convertToPrePostService.calulatePre(question.getQuestion());
        model.addAttribute("answer",questionModel);
        return "ConvertAnswerPage";
    }

    //postfix to prefix
    @RequestMapping(value="/convert", method= RequestMethod.POST, params="action=posttopre")
    public String convertposttopre(Model model, QuestionModel question)
    {
        System.out.println(question.getQuestion());
        QuestionModel questionModel= convertToPrePostService.calculateposttopre(question.getQuestion());
        model.addAttribute("answer",questionModel);
        return "ConvertAnswerPage";
    }

    //prefix to postfix
    @RequestMapping(value="/convert", method= RequestMethod.POST, params="action=pretopost")
    public String convertpretopost(Model model, QuestionModel question)
    {
        System.out.println(question.getQuestion());
        QuestionModel questionModel= convertToPrePostService.calculatepretopost(question.getQuestion());
        model.addAttribute("answer",questionModel);
        return "ConvertAnswerPage";
    }

    //postfix to infix
    @RequestMapping(value="/convert", method= RequestMethod.POST, params="action=posttoin")
    public String convertposttoin(Model model, QuestionModel question)
    {
        System.out.println(question.getQuestion());
        QuestionModel questionModel= convertToPrePostService.calculateposttoin(question.getQuestion());
        model.addAttribute("answer",questionModel);
        return "ConvertAnswerPage";
    }

    //prefix to infix
    @RequestMapping(value="/convert", method= RequestMethod.POST, params="action=pretoin")
    public String convertpretoin(Model model, QuestionModel question)
    {
        System.out.println(question.getQuestion());
        QuestionModel questionModel= convertToPrePostService.calculatepretoin(question.getQuestion());
        model.addAttribute("answer",questionModel);
        return "ConvertAnswerPage";
    }







}
