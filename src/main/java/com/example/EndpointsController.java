package com.example;

import org.springframework.web.bind.annotation.*;

/**
 * Created by oswaldosalazar on 2/17/17.
 */
@RestController
public class EndpointsController {

    @GetMapping("/")
    public String getIndex() {
        return "GET to index route";
    }

    @GetMapping("/tasks")
    public String getTasks() {
        return "These are tasks";
    }

    @PostMapping("/tasks")
    public String createTask() {
        return "You just POSTed to /tasks";
    }

    @PatchMapping("/tasks")
    public String modifyTask() {
        return "You PATCHed to /tasks";
    }

    @DeleteMapping("/tasks")
    public String deleteTask() {
        return "You DELETEd to /tasks";
    }

}
