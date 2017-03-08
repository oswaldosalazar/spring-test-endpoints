package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oswaldosalazar on 3/8/17.
 */
@RestController
@RequestMapping("/math")
public class PiWithGetController {
    @GetMapping("/pi")
    public String piMethod(){
        return "3.141592653589793";
    }
}
