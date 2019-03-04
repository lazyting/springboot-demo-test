package com.lzt.controller;

import com.lzt.dto.GirlRepository;
import com.lzt.entity.GirlProperties;
import com.lzt.entity.getConfig.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lzt on 2019/3/4.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private Environment env;
    @Autowired
    private DBConfig1 dbConfig1;
    @Autowired
    private DBConfig2 dbConfig2;
    @Autowired
    private InfoConfig1 infoConfig1;
    @Autowired
    private InfoConfig2 infoConfig2;


    @PostMapping("/postMapping")
    public void postMapping() {
        System.out.println("DBConfig1:" + dbConfig1.getUsername() + ":" + dbConfig1.getPassword());
        System.out.println("DBConfig2:" + dbConfig2.getUsername() + ":" + dbConfig2.getPassword());
        System.out.println("environmentTest:" + env.getProperty("girl.cupsize"));
        System.out.println("infoConfig1:" + infoConfig1.getAddress() + "," + infoConfig1.getCompany() + "," + infoConfig1.getDegree());
        System.out.println("infoConfig2:" + infoConfig2.getAddress() + "," + infoConfig2.getCompany() + "," + infoConfig2.getDegree());
    }
}
