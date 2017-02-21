package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by oswaldosalazar on 2/20/17.
 */
@RestController
public class QuerystringAccessController {

    @GetMapping("/vehicles")
    public String getQuerystringAccessParam(@RequestParam String year) {
        return String.format("Year is: %s", year);
    }

    @GetMapping("/map-example/map")
    public String getMapParams(@RequestParam Map querystring) {
        return querystring.toString();
    }

}
