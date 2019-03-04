package com.lzt.services;

import org.springframework.stereotype.Component;

/**
 * Created by lzt on 2018/8/18.
 */
@Component
public interface DubboProvideService {

    String sayHello(String name);
}
