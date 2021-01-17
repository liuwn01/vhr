package org.spt.firstmybatissinglesource.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.spt.firstmybatissinglesource.Entity.Fortest;
import org.spt.firstmybatissinglesource.Service.FortestService;

@RestController
public class ForTestController {

    @Autowired
    FortestService fortestService;

    @PostMapping("/addft")
    public Fortest addFT(String name){
        return fortestService.insertft(name);
    }

}
