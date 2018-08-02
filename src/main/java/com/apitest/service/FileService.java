package com.apitest.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileService {
    public String upload(MultipartFile file){
        String newFileName = "newFileName";
        return newFileName;
    }
}