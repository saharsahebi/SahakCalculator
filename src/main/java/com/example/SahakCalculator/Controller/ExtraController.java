package com.example.SahakCalculator.Controller;

import com.example.SahakCalculator.Model.QuestionModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExtraController {

    @GetMapping("/aboutus")
    public String aboutus() {
        System.out.println("I got it in gotopre");
        return "AboutUs";
    }

}
