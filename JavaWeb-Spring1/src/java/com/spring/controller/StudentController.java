/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.bean.Student;
import com.spring.model.StudentModel;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class StudentController extends MultiActionController {

    public StudentController() {
    }

    public ModelAndView add(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("add");
        Map<String, Object> model = mv.getModel();
        model.put("StudentForm", new Student());
        return mv;
    }
    public ModelAndView insert(
            HttpServletRequest request,
            HttpServletResponse response,
            Student stud) throws Exception {
        ModelAndView mv = new ModelAndView("redirect:/home.htm");
        System.out.println("======DATA=======" + stud);
        int add = StudentModel.add(stud);
        
        return mv;    
    }
    public ModelAndView update( 
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("home");
        return mv;    
    }

    public ModelAndView select(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

    public ModelAndView delete(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

}
