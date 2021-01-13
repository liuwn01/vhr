package org.spt.firstftl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.spt.firstftl.model.Author;
import org.spt.firstftl.model.Book;
import org.spt.firstftl.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @GetMapping("/index")
    public String index(Model model){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId((long)i);
            u.setUsername("username"+ i);
            u.setAddress("address"+i);
            users.add(u);
        }
        model.addAttribute("users",users);
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model){
        Map<String,Object> map = model.asMap();
        System.out.println(map);
        int i = 1/0;
        return "hello controller advice";
    }

    //http://localhost:8080/book?a.name=a&a.age=2&b.price=3&b.name=bbb
    @PostMapping("/book")
    public String addBook(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author){
        System.out.println(book);
        System.out.println(author);
        return "others";
    }

    public void test1(Book book){

    }

}
