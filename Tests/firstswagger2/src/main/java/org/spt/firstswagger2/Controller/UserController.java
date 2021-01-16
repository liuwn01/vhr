package org.spt.firstswagger2.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.spt.firstswagger2.Model.User;

@RestController
@Api(tags = "User Interface")
@RequestMapping("/user")
public class UserController {

    @PostMapping("/addUser")
    @ApiOperation("Add user")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "user name", defaultValue = "empty"),
            @ApiImplicitParam(name = "address", value = "user address", defaultValue = "empty", required = true)
    })
    public User addUser(String username, @RequestParam(required = true) String address){
        User u = new User();
        u.setId(1);
        u.setUsername(username);
        u.setAddress(address);
        return u;
    }

    @GetMapping("/getUserById/{id}")
    @ApiOperation("get user info via id")
    @ApiImplicitParam(name = "id", value = "user id", defaultValue = "0", required = true)
    public User getUserById(@PathVariable Integer id){
        User u = new User();
        u.setId(id);
        return u;
    }

}
