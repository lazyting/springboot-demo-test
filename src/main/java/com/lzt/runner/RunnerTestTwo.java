package com.lzt.runner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * 如果你想在Spring Boot启动的时候运行一些特定的代码，你可以实现接口 ApplicationRunner或者 CommandLineRunner，
 * 这两个接口实现方式一样，它们都只提供了一个run方法。
 * <p>
 * 如果启动的时候有多个ApplicationRunner和CommandLineRunner，想控制它们的启动顺序，可以实现 org.springframework.core.Ordered接口
 * 或者使用 org.springframework.core.annotation.Order注解。
 * Created by lzt on 2019/3/4.
 */
@Component
public class RunnerTestTwo implements CommandLineRunner, Ordered {
    @Override
    public void run(String... args) throws Exception {
        for (String s : args) {
            System.out.println("参数：" + s);
        }
        System.out.println("---------------------------------------------");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
