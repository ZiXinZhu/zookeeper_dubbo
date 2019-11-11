package com.zzx.controller;

import com.zzx.server.imp.IUserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserConsumer {

    @Autowired
    IUserServer userServer;

    @PostMapping("/login")
    public String login(String username,String password){
        return userServer.login(username, password);
    }
}
