package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oswaldosalazar on 2/18/17.
 */
@RestController
@RequestMapping("/app")
public class QuerystringController {

    @GetMapping("/foo")
    public String getFoo() {
        return "foo";
    }

    @GetMapping("/bar")
    public String getBar() {
        return "bar";
    }

    @GetMapping("/baz")
    public String getBaz() {
        return "baz";
    }

}
