package org.spt.firstthymleaf.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId((long)i);
            u.setName("javaboy:" + i);
            u.setAddress("shenzhen: " + i);
            users.add(u);
        }
        model.addAttribute("users",users);
        model.addAttribute("username","li4");
        return "index";
    }

    @GetMapping("/mail")
    public String mail(Model model){
        model.addAttribute("position","java enginer");
        model.addAttribute("username","li4");
        model.addAttribute("salary",99999);
        return "mail";
    }
}

class User {
    private Long id;
    private String name;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
