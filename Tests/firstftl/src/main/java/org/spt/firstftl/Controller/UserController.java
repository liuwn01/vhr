package org.spt.firstftl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.spt.firstftl.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/in")
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
}
