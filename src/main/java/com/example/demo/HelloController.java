package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String TEST_SECRET = "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";

    @GetMapping("/")
    public String home() {
        return "Hello!!! Automatic CI/CD deployment works!";
    }
}