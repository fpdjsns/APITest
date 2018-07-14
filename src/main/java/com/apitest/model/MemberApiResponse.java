package com.apitest.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberApiResponse {
    private String memberName;

    // 나이 추가
    private int age;
}
