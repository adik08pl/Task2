package com.stempien.Task2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController
{
    @GetMapping("calculate")
    @ResponseBody
    public String calculateWindow(@RequestParam String operation,@RequestParam int a,@RequestParam int b){
        switch(operation){
            case "add":
                return a+" + "+b+" = "+(a+b);
            case "subtract":
                return a+" - "+b+" = "+(a-b);
            case "multiply":
                return a+" * "+b+" = "+(a*b);
            case "divide":
                if(b==0)
                    return "Nie dzielimy przez 0";
                return a+" : "+b+" = "+(a/b);
            default:
                return "Coś poszło nie tak";
        }
    }
}
