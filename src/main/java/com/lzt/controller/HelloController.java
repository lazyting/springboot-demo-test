package com.lzt.controller;

import com.lzt.entity.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lzt on 2018/7/9.
 */
@RestController
@RequestMapping(value = "/first")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupsize();
    }

    @RequestMapping(value = "/other",method = RequestMethod.POST)
    public String other(@RequestParam(value="id",required = false,defaultValue = "0") String id){
        return id;
    }

    //localhost:8080/first/two/23
    @RequestMapping(value = "/two/{id}",method = RequestMethod.POST)
    public String two(@PathVariable("id") Integer id ){
        return "id:"+id;
    }
    //localhost:8080/first/23/three
    @RequestMapping(value = "/{id}/two",method = RequestMethod.POST)
    public String three(@PathVariable("id") Integer id ){
        return "id:"+id;
    }

    /**
     * 组合注解GetMapping
     * @param id
     * @return
     */
    @GetMapping("/getMapping")
    public String getMapping(@PathVariable("id") Integer id ){
        return "id:"+id;
    }

    /**
     * 组合注解PostMapping
     * @param id
     * @return
     */
    @PostMapping("/postMapping")
    public String postMapping(@PathVariable("id") Integer id ){
        return "id:"+id;
    }
}
