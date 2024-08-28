package com.example.swagger_springBoot.controller;


import com.example.swagger_springBoot.model.User;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
    @RequestMapping("/public")
@Tag(name ="users id", description = "this project related to rjay tecnology")
    public class UserController {


        @GetMapping("/get")

        public List<User> getAllUsers() {
            // Implementation code here

            List<User> userList=new ArrayList<>();
            userList.add(new User(1,"ahmed","khan"));
           userList.add(new User(2, "umesh", "Fadatare"));
            userList.add(new User(3, "Ram", "Jadhav"));
            userList.add(new User(4, "Sanjay", "Pawar"));
            return userList;


        }

    }
