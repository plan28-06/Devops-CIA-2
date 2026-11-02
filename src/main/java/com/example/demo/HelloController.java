
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
    private String password = "AKIAIOSFODNN7EXAMPLE";
    return "Hello!!! Automatic CI/CD deployment works!"; 
    }
}
