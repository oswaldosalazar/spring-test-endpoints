package com.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by oswaldosalazar on 4/3/17.
 */

@RestController
public class MathCalculateController {

    public String result;
    @GetMapping("/math/calculate")
    public String getCalculate(@RequestParam int x, int y, String operation) {

        if (operation == null) {
            result = String.format("%s + %s = %s",x, y, x + y);
        } else {
            switch (operation) {
                case "add":
                    result = String.format("%s + %s = %s",x, y, x + y);
                    break;
                case "multiply":
                    result = String.format("%s + %s = %s",x, y, x * y);
                    break;
                case "substract":
                    result = String.format("%s + %s = %s",x, y, x - y);
                    break;
                case "divide":
                    result = String.format("%s + %s = %s",x, y, x - y);
                    break;
            }
        }

        return result;
    }

    @PostMapping("/math/sum")
    public String postSum(@RequestParam("n") int[] params) {
        return String.format("%s + %s + %s  = %s",params[0], params[1], params[2],
                params[0] + params[1] + params[2]);
    }

}
