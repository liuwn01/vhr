package org.spt.firstjpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.spt.firstjpa.Dao.UserDao;
import org.spt.firstjpa.Entity.User;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @PostMapping("/")
    public void addUser(){
        User user = new User();
        //user.setId(1);
        user.setUsername("name1");
        user.setAddress("address1");
        userDao.save(user);
    }

    @DeleteMapping("/")
    public void deleteById(Integer i){
        userDao.deleteById(i);
    }

    @PutMapping("/")
    public void updateUser(Integer id, String name){
        User user = userDao.getOne(id);
        user.setUsername(name);
        userDao.flush();
    }

    @GetMapping("/getallusers")
    public List<User> getallusers(){
        List<User> all = userDao.findAll();
        return all;
    }

}
