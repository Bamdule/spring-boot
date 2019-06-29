package com.example.demo;

import com.example.demo.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//@RunWith(SpringRunner.class)

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class SpringBootJunitApplicationTests {
    
    @Autowired
    private MemberService memberService;

    @Test
    public void contextLoads() throws Exception {
        
        System.out.println(memberService.getMember());
    }

}
