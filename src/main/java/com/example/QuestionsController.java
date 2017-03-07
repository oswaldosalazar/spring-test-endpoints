package com.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oswaldosalazar on 3/6/17.
 */
@RestController
public class QuestionsController {
    @PostMapping("/question")
    public String getQuestion() {
        return "Nailed it!";
    }
}
