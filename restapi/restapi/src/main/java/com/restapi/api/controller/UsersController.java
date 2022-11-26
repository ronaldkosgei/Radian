package com.restapi.api.controller;

import model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("users")
public class UsersController {


    @PostMapping
    public User addUsers(@RequestBody User user) {
        return user;
    }

    @GetMapping("all")
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();

        //add user
        User user=createUser();
        list.add(user);

        //add user 1
        User user1=createUser1();
        list.add(user1);

        //user 2
       User user2=createUser2();
       list.add(user2);

        //user 3
        User user3=createUser3();
        list.add(user3);


        //user 4
        User user4=createUser4();
        list.add(user4);

        return list;
    }

    @GetMapping("/idNumber/{idNumber}/{email}")
    public String getUserByIdNumber(@PathVariable("idNumber") int idNumber, @PathVariable("email") String email) {
        return idNumber+" ID AND EMAIL  "+email;
    }

    @GetMapping("/idNumber")
    public int exampleRequestParam(@RequestParam("idNumber") int idNumber) {
        return idNumber;
    }

    @PostMapping("/sum")
    public int exampleRequestParam(@RequestParam("length") int length, @RequestParam("width") int width) {
        return length + width;
    }

    @PutMapping("/idNumber")
    public int addUserByIdNumber(@PathVariable("idNumber") int idNumber) {
        return idNumber;
    }

    @DeleteMapping("/deleteUser/{idNumber}")
    public boolean deleteUserByIdNumber(@PathVariable("idNumber") int idNumber) {
        return true;
    }

    @PatchMapping("/user/{firstName}")
    public User updateUserByFirstName(@PathVariable("firstName") String firstName){
        User user = createUser1();
        user.setFirstName(firstName);
        return user;
    }


    private User createUser(){
        User user = new User();
        user.setFirstName("Ronald");
        user.setMiddleName("Kiprono");
        user.setLastName("Too");
        user.setEmail("kipronoronald@gmail.com");
        user.setAge(34);
        user.setIdNumber(37845654);
        return user;
    }

    private User createUser1(){
        User user1 = new User();
        user1.setFirstName("Dancun");
        user1.setMiddleName("Kiprono");
        user1.setLastName("Gray");
        user1.setEmail("kipronodancun@gmail.com");
        user1.setAge(25);
        user1.setIdNumber(37563833);
        return user1;
    }

    private User createUser2(){
        User user2 = new User();
        user2.setFirstName("Ismael");
        user2.setMiddleName("kipngeno");
        user2.setLastName("Rotich");
        user2.setEmail("rotichismael@gmail.com");
        user2.setAge(19);
        user2.setIdNumber(3764526);
        return user2;
    }

    private User createUser3() {
        User user3 = new User();
        user3.setFirstName("Shebesh");
        user3.setMiddleName("Mary");
        user3.setLastName("Wanjiku");
        user3.setEmail("wanjikushebesh@gmail.com");
        user3.setAge(33);
        user3.setIdNumber(36859676);
        return user3;
    }

    private User createUser4(){
        User user4 = new User();
        user4.setFirstName("Aaron");
        user4.setMiddleName("Mwai");
        user4.setLastName("Collins");
        user4.setEmail("collinsaaron@gmail.com");
        user4.setAge(21);
        user4.setIdNumber(3698463);
        return user4;
    }

}
