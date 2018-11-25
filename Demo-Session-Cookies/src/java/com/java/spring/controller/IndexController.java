/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spring.controller;

import com.java.spring.bean.User;
import com.java.spring.model.AuthModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author chellong
 */
@Controller
@SessionAttributes(value = "loginInfo")
public class IndexController {
     @RequestMapping(value = "/home.view")
    public String index () {
        return "home";
    }
    @RequestMapping(value = "/login.view")
    public String login (ModelMap model) {
        model.addAttribute("user", new User());
        return "login";
    }
    @RequestMapping(value = "/logout.view")
    public String logout (ModelMap model, SessionStatus session) {
        session.setComplete();
        return "redirect:/login.view";
    }
    @RequestMapping(value = "/auth.view")
    public String auth (@ModelAttribute(value = "user") User user, ModelMap model) {
        boolean check = AuthModel.auth(user);
        System.out.println("check " + check);
        if(check) {
            model.addAttribute("loginInfo", user);
        } else {
            return "redirect:/login.view";
        }
        return "redirect:/home.view";
    }
    
}
