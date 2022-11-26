package userservices.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import userservices.VO.ResponseTemplateVO;
import userservices.entity.User;
import userservices.service.UserServices;

@RestController
@RequestMapping("/users")
@Slf4j
public class Usercontroller {

    @Autowired
    private UserServices userServices;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userServices.saveUser(user);
    }

    @GetMapping("/id{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userServices.getUserWithDepartment(userId);
    }
}
