package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oswaldosalazar on 3/6/17.
 */

@RestController
@RequestMapping("/questions/bysurvey")
public class QuestionsController {

//    @PostMapping("/question")
//    public String getQuestion() {
//        return "Nailed it!";
//    }

//    @GetMapping("/")
//    public String myMethod(){
//        return "Nailed it!";
//    }

//    @GetMapping("/about/team")
//    public String myMethod1(){
//        return "Nailed it again!";
//    }

//    @GetMapping("/all")
//    public String myMethod2(){
//        return "Nailed it!";
//    }

    @GetMapping("/all")
    public String myMethod3(){
        return "Nailed it!";
    }

}
