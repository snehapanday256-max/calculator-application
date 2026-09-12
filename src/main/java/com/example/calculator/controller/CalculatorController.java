package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin(origins = "*") 
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService; 

    
    @GetMapping("/api/calculate")
    public String calculate(
            @RequestParam double num1, 
            @RequestParam double num2, 
            @RequestParam String operation) {
        
    
     return calculatorService.Calculation(num1, num2, operation);
    }
}