package com.jashith123.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    // Maps HTTP GET requests for "/greet" with an optional query parameter
    // Example: http://localhost:8080/greet?name=Alice
    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s!", name);
    }

    @GetMapping("/jashith")
    public String greet234() {
        return "Hi jashith.. 5345435436346346436";
    }

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Addition result: " + (a + b);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        return "Subtraction result: " + (a - b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return "Multiplication result: " + (a * b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Division by zero is not allowed.";
        }
        return "Division result: " + (a / b);
    }

    @GetMapping("/modulus")
    public String modulus(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Modulus by zero is not allowed.";
        }
        return "Modulus result: " + (a % b);
    }
}
