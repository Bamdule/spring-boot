/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author MW
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "")
    public String loginView() {
        logger.debug("login Page !");
        return "loginPage";
    }
}
