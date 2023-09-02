package com.and.dabbawalla.controller;

import com.and.dabbawalla.entity.User;
import com.and.dabbawalla.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return "User Registered Successfully!";
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@PathVariable Long id) {
      return userService.getUserById(id).orElseThrow(RuntimeException::new);

    }

}
