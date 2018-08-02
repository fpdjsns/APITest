package com.apitest.controller;

import com.apitest.model.MemberApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

@RestController
@RequestMapping("/member")
public class GetTest {

    // localhost:8080/member/ok
    @RequestMapping("/ok")
    public ResponseEntity<String> root(){
        return ResponseEntity.ok("Get OK");
    }

    // localhost:8080/member?member=testMember
    @RequestMapping("/")
    public ResponseEntity<String> requestParamTest(@RequestParam(value = "member") String member){
        return ResponseEntity.ok(member);
    }

    // localhost:8080/member/testMember
    @GetMapping("/{member}")
    public ResponseEntity<MemberApiResponse> pathVariableTest(@PathVariable String member){
        MemberApiResponse response = new MemberApiResponse();
        response.setMemberName(member);
        // dummy age
        response.setAge(10);
        return ResponseEntity.ok(response);
    }
}
