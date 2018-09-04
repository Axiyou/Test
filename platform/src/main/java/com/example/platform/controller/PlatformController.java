package com.example.platform.controller;

import com.example.platform.service.PlatformService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/user")
public class PlatformController {

    @Resource
    private PlatformService platformService;

    @RequestMapping(value = "/list")
    public String list(){
        Integer sum = platformService.selectSum();
        System.out.println(sum);
        return "list";
    }
}
