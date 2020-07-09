package com.weixin.nxtfrm.controller;

import com.weixin.nxtfrm.entity.User;
import com.weixin.nxtfrm.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String displayName, @RequestParam String email,
                      @RequestParam String country) {
        User user = new User();
        user.setDisplayName(displayName);
        user.setEmail(email);
        user.setCountry(country);
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
