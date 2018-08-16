package com.apitest.controller;

import com.apitest.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/files")
public class FileController {

  @Autowired
  FileService fileService;

  @PostMapping
  public ResponseEntity<String> uploadFile(MultipartFile file) {
    String result = fileService.upload(file);
    return ResponseEntity.ok(result);
  }

  @GetMapping
  public ResponseEntity downloadFile(HttpServletRequest request, HttpServletResponse response,
      @PathVariable String fileName) {
    return ResponseEntity.ok().build();
  }
}
