package com.zzx.server.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzx.server.UserServer;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Service(interfaceClass = UserServer.class)
public class IUserServer implements UserServer {

    @Override
    public String login(String username, String password) {
        if(StringUtils.isEmpty(username)&&StringUtils.isEmpty(password)){
            return "账号或密码不能为空！";
        }
        if(username.equals("admin")&&password.equals("admin")){
            return "登录成功";
        }
        return "登录失败";
    }
}
