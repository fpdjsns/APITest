package com.apitest.service;

import org.springframework.stereotype.Service;

@Service
public class JUnitService {

    public int calculate(int a, int b, String oper){
        switch(oper){
            case "ADD":
                return a+b;
            case "SUB":
                return a-b;
            case "MUL":
                return a*b;
            case "DIV":
                return a/b;
            default:
                return 0;
        }
    }

}
