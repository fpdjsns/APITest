package com.apitest.controller;

import com.apitest.model.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enum")
public class EnumTest {

    @GetMapping("/calculates")
    public ResponseEntity<?> getCalculates(@RequestParam int a,
                                           @RequestParam int b,
                                           @RequestParam Calculator calculator){
        int response = calculator.calculate(a, b);
        return ResponseEntity.ok(response);
    }
}
