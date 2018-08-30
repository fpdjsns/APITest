package com.apitest.controller;

import com.apitest.model.DeserializerTestRequest;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deserializer")
public class DeserializerTestController {

  @PostMapping
  public ResponseEntity<List<String>> postDeserializerTest(
      @RequestBody DeserializerTestRequest request) {
    List<String> response = request.getNames();
    return ResponseEntity.ok(response);
  }
}
