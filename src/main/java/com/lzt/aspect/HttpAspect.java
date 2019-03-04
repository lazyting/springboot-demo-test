package com.lzt.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Created by lzt on 2018/7/11.
 */
@Aspect                         //添加切面依赖
@Component                      //引入spring容器中
public class HttpAspect {

    private  final static Logger logger=LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.lzt.controller.GirlController.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void log(){
        logger.info("111111111");
    }

    @After("pointCut()")
    public void doAfter(){
        logger.info("22222222");
    }
}
