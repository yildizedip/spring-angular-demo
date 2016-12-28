package com.controller;

import com.entities.BlogEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pardus on 12/28/16.
 */
public class BlogEntryController {

    @RequestMapping("/test")
    public ResponseEntity<Object> test(){

        BlogEntry entry= new BlogEntry("Title");


        return new ResponseEntity<Object>(entry, HttpStatus.OK);
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public @ResponseBody BlogEntry test2(@RequestBody BlogEntry entry){

       // BlogEntry entry= new BlogEntry("Title");


        return entry;
    }
}
