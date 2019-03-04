package com.lzt.controller;

import com.lzt.dto.GirlRepository;
import com.lzt.entity.Girl;
import com.lzt.model.Result;
import com.lzt.services.DubboProvideService;
import com.lzt.services.GirlServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by lzt on 2018/7/10.
 */
@RestController
public class GirlController {
    private  final static Logger logger= LoggerFactory.getLogger(GirlController.class);
    @Autowired
    private GirlServices girlServices;
    @Resource
    private DubboProvideService dubboProvideService;

    @PostMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlServices.getGirls();
    }

    @PostMapping(value = "/girladd")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        return girlServices.saveGirl(girl,bindingResult);
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String toHello(){
        return "hello";
    }


    @RequestMapping(value = "/sayHelloDubbo" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test(){
        return dubboProvideService.sayHello("bu fu jiu gan!");
    }
}
