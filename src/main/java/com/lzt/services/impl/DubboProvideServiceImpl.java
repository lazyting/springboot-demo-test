package com.lzt.services.impl;

import com.lzt.services.DubboProvideService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by lzt on 2018/8/18.
 */
@Service
public class DubboProvideServiceImpl implements DubboProvideService {
    @Override
    public String sayHello(String name) {
        return "Hello,say Dubbo Hello "+name;
    }
}
