package org.spt.firstmybatismultisource.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.spt.firstmybatismultisource.Entity.test.T1;
import org.spt.firstmybatismultisource.Entity.vhr.Fortest;
import org.spt.firstmybatismultisource.Service.HandleService;

import java.util.List;

@RestController
public class HandleController {

    @Autowired
    HandleService handleService;

    @GetMapping("/getallft")
    public String getallft(){
        return handleService.getallft().toString();
    }

    @GetMapping("/getallt1")
    public String getallt1(){
        return handleService.getallt1().toString();
    }
}
