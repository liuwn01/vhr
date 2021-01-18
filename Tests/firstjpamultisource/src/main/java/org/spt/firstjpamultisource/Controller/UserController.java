package org.spt.firstjpamultisource.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.spt.firstjpamultisource.Dao.test.UsertestDao;
import org.spt.firstjpamultisource.Dao.vhr.UserDao;
import org.spt.firstjpamultisource.Model.vhr.User;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDao userDaovhr;

    @Autowired
    UsertestDao userDaotest;

    @GetMapping("/getallvhrusers")
    public List<User> getallvhrusers(){
        List<User> all = userDaovhr.findAll();
        return all;
    }

    @GetMapping("/getalltestusers")
    public List<org.spt.firstjpamultisource.Model.test.User> getalltestusers(){
        List<org.spt.firstjpamultisource.Model.test.User> all = userDaotest.findAll();
        return all;
    }

}
