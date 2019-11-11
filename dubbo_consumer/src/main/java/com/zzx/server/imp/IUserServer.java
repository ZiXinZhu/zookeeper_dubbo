package com.zzx.server.imp;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzx.server.UserServer;
import org.springframework.stereotype.Component;

@Component
public class IUserServer {

    @Reference
    UserServer userServer;

    public String login(String username,String password){
        return userServer.login(username, password);
    }
}
