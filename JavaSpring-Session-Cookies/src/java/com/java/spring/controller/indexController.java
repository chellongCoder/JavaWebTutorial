/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author chellong
 */
@Controller
public class indexController {
    
    @RequestMapping(value = "/index")
    public String index () {
        return "index";
    }
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }
}
