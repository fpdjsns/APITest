package com.apitest.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetTest {

    // localhost:8080/ok
    @RequestMapping("/ok")
    public ResponseEntity<String> root(){
        return ResponseEntity.ok("Get OK");
    }

    // localhost:8080?member=testMember
    @RequestMapping("/")
    public ResponseEntity<String> requestParamTest(@RequestParam(value = "member") String member){
        return ResponseEntity.ok(member);
    }

    // localhost:8080/testMember
    @GetMapping("/{member}")
    public ResponseEntity<String> pathVariableTest(@PathVariable String member){
        return ResponseEntity.ok(member);
    }
}
