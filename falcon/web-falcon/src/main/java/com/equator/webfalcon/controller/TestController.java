package com.equator.webfalcon.controller;

import com.equator.model.dto.Response;
import com.equator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Equator
 * @Date: 2019/11/30 9:16
 **/

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private UserService userService;
    @GetMapping("/ping")
    public Response get(String query){
        return Response.success("pong",userService.getAllUser());
    }
}
