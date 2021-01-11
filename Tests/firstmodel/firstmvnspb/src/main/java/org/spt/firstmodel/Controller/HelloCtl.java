package org.spt.firstmodel.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.spt.firstmodel.model.Book;
import org.spt.firstmodel.model.myconfig;
import org.spt.firststarter.HelloService;

@RestController
public class HelloCtl {

    @Autowired
    Book book;
    @Autowired
    myconfig mc;

    @Autowired
    HelloService hellos;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getbook")
    public String getbook(){
        return book.toString();
    }

    @GetMapping("/getmc")
    public myconfig getmc(){return mc;}

    @GetMapping("/sayhello")
    public String sayhello() {return hellos.sayhello();}
}
