package com.lzt.entity.getConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by lzt on 2019/3/4.
 */
@Component
public class InfoConfig1 {
    @Value("${info.address}")
    private String address;
    @Value("${info.company}")
    private String company;
    @Value("${info.degree}")
    private String degree;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
