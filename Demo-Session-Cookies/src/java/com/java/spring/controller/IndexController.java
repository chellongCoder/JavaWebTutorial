/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spring.controller;

import com.java.spring.bean.User;
import com.java.spring.model.AuthModel;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author chellong
 */
@Controller
@SessionAttributes(value = "loginInfo")

public class IndexController {

    @RequestMapping(value = "/home.view")
    public String index(ModelMap model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            User user = new User();
            for (Cookie cooky : cookies) {
                System.out.println("Cookie " + cooky.getValue());
                if (cooky.getName().equals("username")) {
                    user.setUsername(cooky.getName());
                } else if (cooky.getName().equals("password")) {
                    user.setPassword(cooky.getName());
                }
            }
            System.out.println("session " + session.getAttribute("loginInfo"));
            if (session == null) {
                model.addAttribute("loginForm", user);
            }
        }
        return "home";
    }

    @RequestMapping(value = "/login.view")
    public String login(ModelMap model, HttpServletRequest request) {
        model.addAttribute("user", new User());
        String login = request.getParameter("login");
        String logout = request.getParameter("logout");
        model.addAttribute("login", login);
        model.addAttribute("logout", logout);

        return "login";
    }

    @RequestMapping(value = "/logout.view")
    public String logout(ModelMap model, SessionStatus session, HttpServletRequest request, HttpServletResponse response) {
        session.setComplete();

        Cookie[] cookies = request.getCookies();
        for (Cookie cooky : cookies) {
            if (cooky.getName().equals("username") || cooky.getName().equals("password")) {
                cooky.setValue("");
                cooky.setMaxAge(0);
                response.addCookie(cooky);
            }
        }
        return "redirect:/login.view?logout=true";
    }

    @RequestMapping(value = "/auth.view")
    public String auth(@ModelAttribute(value = "user") User user, ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        boolean check = AuthModel.auth(user);
        System.out.println("check " + check);
        ModelAndView mav = null;
        String remember = request.getParameter("remember");
        System.out.println("REMEMBER " + remember);
        if (check) {
            model.addAttribute("loginInfo", user);
            if (remember != null) {
                Cookie userCookie = new Cookie("username", user.getUsername());
                userCookie.setMaxAge(60 * 60);
                response.addCookie(userCookie);
                Cookie passCookie = new Cookie("password", user.getPassword());
                passCookie.setMaxAge(60 * 60);
                response.addCookie(passCookie);
            }
        } else {
            mav = new ModelAndView("login");
            mav.addObject("error", "error");
            return "redirect:/login.view?login=false";
        }
        return "redirect:/home.view";
    }

}
