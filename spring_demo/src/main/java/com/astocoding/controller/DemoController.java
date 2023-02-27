package com.astocoding.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ LITAO.
 *
 * @author litao
 * @since 2023/2/27 14:52
 */
@RestController("/")
public class DemoController {

    // controller test in path: http://localhost:8080/demo
    @GetMapping("/demo")
    public String demo(){
        return "hello world";
    }
}
