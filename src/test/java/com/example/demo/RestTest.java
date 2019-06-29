package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author MW
 */
@RunWith(SpringRunner.class)
@RestClientTest
public class RestTest {
    
    final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Test
    public void rest_test() {
        
        logger.info("TEST!!");
        System.out.println("고고?");
        
    }
}
