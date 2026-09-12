package com.example.calculator.service;
import org.springframework.stereotype.Service;
@Service 
public class CalculatorServiceImp implements CalculatorService {
    @Override
    public String Calculation(double num1, double num2, String operation) {
        double result = 0;
        if (operation.equalsIgnoreCase("add")) {
             result = num1 + num2;
             return "Addition successful! Result: " + result;
}
    if (operation.equalsIgnoreCase("subs")) {
                  result = num1 - num2;
            return "Substraction successful! Result: " + result;
}
    if (operation.equalsIgnoreCase("multiply")) {
               result = num1 * num2;
               return "multiply successful! Result: " + result;
}
    else if (operation.equalsIgnoreCase("divide")) {
                   if (num2 == 0) {
                return "Error: Cannot divide by zero!";
    }
         return "Division successful! Result: " + (num1 / num2); 
} else {
            return "Invalid Operation!";
        }
        } 
        }
