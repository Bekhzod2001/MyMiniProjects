package org.example.bekhzod.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

        //System.out.println("Hello,"+ name+" " + surname);
        model.addAttribute("message","Hello,"+ name+" " + surname);

        return "first/hello";
    }

    @GetMapping ("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }


    @GetMapping("/calculator")
    public String getCalculator(@RequestParam(value = "a") int a,
                                @RequestParam(value = "b") int b,
                                @RequestParam(value = "action") String action,
                                Model model){

        double result=0.0;
        String act;
            if(action.equals("multiplication")){
                result = (double)a*b;
                act = action;
            }
            else if(action.equals("addition")){
                result = (double)a+b;
                act = action;
            }
            else if(action.equals("subtraction")){
                result = (double)a-b;
                act = action;
            }
            else if(action.equals("division")){
              result = (double)a/b;
                act = action;
            }else{
                act = "No such operation";
            }

        model.addAttribute("result", "Result: " + result+ " /"+ act);

        return "first/calculator";
    }

}
