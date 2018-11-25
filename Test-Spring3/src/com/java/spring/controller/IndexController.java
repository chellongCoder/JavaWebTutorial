package com.java.spring.controller;


import com.java.spring.bean.Customer;
import com.java.spring.db.DatabaseConfig;
import com.java.spring.model.CustomerModel;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by saurabh on 2/11/17.
 */

@Controller
@ComponentScan(basePackages = { "com.java.spring.*"})

public class IndexController {
    @Autowired
    private DataSource dataSource;
    @RequestMapping("/")
    public String home(Model m) {
        List<Customer> listCustomer = null;
        try {
            CustomerModel model = new CustomerModel();
            listCustomer = model.getAll(dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
        m.addAttribute("listCustomer", listCustomer);

        return "home";
    }

    @RequestMapping(value = "/addNew", method = RequestMethod.GET)
    public String addNew(Model m) {
        m.addAttribute("command", new Customer());
        return "addNew";
    }

    @RequestMapping(value = "/save")
    public String save(@ModelAttribute( name = "customer") Customer cust, Model m) {
        System.out.println("-------CUSTOMER------" + cust);
        try {
            int result = CustomerModel.saveCustomer(cust, dataSource);
            if(result>0) System.out.println("INSERT SUCCESS");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/update")
    public String update (@RequestParam(value = "id") int id,  ModelMap m) {
        try {
            System.out.println("CUSTOMER >>>" + CustomerModel.getCustomerById(id, dataSource));
//            m.addAttribute("command", CustomerModel.getCustomerById(id, dataSource));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "update";
    }
}