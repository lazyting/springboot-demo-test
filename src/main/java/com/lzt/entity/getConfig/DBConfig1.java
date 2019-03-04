package com.lzt.entity.getConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 注意：@PropertySource不支持yml文件读取。
 * Created by lzt on 2019/3/4.
 */
@Component
@PropertySource(value = {"/db-config.properties"})
public class DBConfig1 {

    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
