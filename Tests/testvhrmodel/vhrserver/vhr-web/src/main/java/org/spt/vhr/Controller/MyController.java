package org.spt.vhr.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.spt.vhr.model.Role;
import org.spt.vhr.service.RoleService;

@RestController
public class MyController {

    @GetMapping("/hello")
    public int hello(){
        RoleService rs = new RoleService();
        Role r = new Role();
        r.setId(1);
        r.setName("name");
        return rs.insertSelective(r);
    }
}
