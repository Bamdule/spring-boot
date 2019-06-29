package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author MW
 */
@Controller
public class HomeController {
    
    @Autowired
    private MemberService memberService;
    
    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/")
    public ModelAndView home() {
        
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("member", memberService.getMember());
        
        logger.info("[MYTEST] 으아아아아아!!");
        
        return modelAndView;
    }
    
}
