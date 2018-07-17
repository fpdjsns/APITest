package com.apitest.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enum")
public class EnumTest {

    @GetMapping("/add")
    public ResponseEntity<?> getAdd(@RequestParam int a, @RequestParam int b){
        int response = a + b;
        return ResponseEntity.ok(response);
    }

    @GetMapping("/sub")
    public ResponseEntity<?> getSub(@RequestParam int a, @RequestParam int b){
        int response = a - b;
        return ResponseEntity.ok(response);
    }

    @GetMapping("/mul")
    public ResponseEntity<?> getMul(@RequestParam int a, @RequestParam int b){
        int response = a * b;
        return ResponseEntity.ok(response);
    }

    @GetMapping("/div")
    public ResponseEntity<?> getDiv(@RequestParam int a, @RequestParam int b){
        int response = a / b;
        return ResponseEntity.ok(response);
    }

}
