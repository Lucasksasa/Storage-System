package com.Lucas_Ferrari.Storage_System.controller;

import com.Lucas_Ferrari.Storage_System.model.Product;
import com.Lucas_Ferrari.Storage_System.model.User;
import com.Lucas_Ferrari.Storage_System.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User addUsers(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("{id}")
    public Optional <User> findIdUser(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @GetMapping
    public List<User> listAllUsers(){
        return userService.listAllUsers();
    }

    @PutMapping("{id}")
    public ResponseEntity<User> productUpdate(@PathVariable Long id, @RequestBody User userUpdated) {

        User user = userService.updateUser(id, userUpdated);

        return ResponseEntity.ok(user);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }

}
