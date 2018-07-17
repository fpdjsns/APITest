package com.apitest.model;

import com.apitest.Service.CalculateService;

public enum Calculator implements CalculateService{
    ADD("ADD"){
        @Override
        public int calculate(int a, int b){
            return a+b;
        }
    },
    SUB("SUB"){
        @Override
        public int calculate(int a, int b){
            return a-b;
        }
    },
    MUL("MUL"){
        @Override
        public int calculate(int a, int b){
            return a*b;
        }
    },
    DIV("DIV"){
        @Override
        public int calculate(int a, int b){
            return a/b;
        }
    };

    String value;

    private Calculator(String value){
        this.value = value;
    }

}
