package com.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oswaldosalazar on 4/3/17.
 */

@RestController
public class MathCalculateController {

    public int result;
    @GetMapping("/math/calculate")
    public String getOperationAdd(@RequestParam String operation , int x, int y) {
        return String.format("%s + %s = %s",x, y, x+y);
    }

}
