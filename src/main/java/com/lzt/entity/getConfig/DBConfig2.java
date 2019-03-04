package com.lzt.entity.getConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by lzt on 2019/3/4.
 */
@Component
@ConfigurationProperties(prefix = "db")
@PropertySource(value = {"/db-config.properties"})
public class DBConfig2 {

    private String username;
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
