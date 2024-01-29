package me.kbh.k8sstudy.api.dog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

  @GetMapping("/name")
  public ResponseEntity<String> getEntityName(){
    return ResponseEntity.ok("dog");
  }
}
