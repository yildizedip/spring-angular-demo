package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pardus on 12/20/16.
 */

@Controller

public class TestController {
    @RequestMapping("/test")
       public String test(){
        return "View";
    }
}
