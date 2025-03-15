package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.UserService;
import com.model.User;

@RestController
@RequestMapping("/userss")
public class UserController 
{
  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> getAllUsers() {
      return userService.getAllUsers();
  }

  @PostMapping
  public User createUser(@RequestBody User user) {
      return userService.saveUser(user);
  }
}
