package com.example.sender.web.view;

import com.example.sender.domain.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskView {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
