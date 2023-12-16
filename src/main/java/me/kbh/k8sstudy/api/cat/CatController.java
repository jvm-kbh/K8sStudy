package me.kbh.k8sstudy.api.cat;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cat")
public class CatController {

  @GetMapping("/name")
  public ResponseEntity<String> getEntityName(){
    return ResponseEntity.ok("cat");
  }
}
