
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private String password = "AKIAIOSFODNN7EXAMPLE";
    @GetMapping("/")
    public String home() {
    return "Hello!!! Automatic CI/CD deployment works!"; 
    }
}
