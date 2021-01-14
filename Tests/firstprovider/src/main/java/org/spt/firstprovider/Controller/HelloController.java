package org.spt.firstprovider.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    //@CrossOrigin(value = "http://localhost:8081")
    public String hello(){
        return "hello";
    }

    @PostMapping("/hello")
    //@CrossOrigin(value = "http://localhost:8081")
    public String hello2(){
        return "post hello";
    }


}
