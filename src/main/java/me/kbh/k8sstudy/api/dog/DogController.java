package me.kbh.k8sstudy.api.dog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dog")
public class DogController {

  @GetMapping("/name")
  public ResponseEntity<String> getEntityName(){
    return ResponseEntity.ok("dog");
  }
}
