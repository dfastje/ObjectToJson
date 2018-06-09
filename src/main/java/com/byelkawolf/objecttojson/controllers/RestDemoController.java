package com.byelkawolf.objecttojson.controllers;

import com.byelkawolf.objecttojson.services.RestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dfast on 7/11/2017.
 */
@Controller
@RequestMapping("/interview")
public class RestDemoController {

    @Autowired
    RestDemoService restDemoService;

    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public @ResponseBody String demo1() {
        return "Hello World";
    }

    @RequestMapping(value = "/demo2", method = RequestMethod.GET)
    public ResponseEntity<String> demo2() {
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/fibbi/{nthNum}", method = RequestMethod.GET)
    public @ResponseBody String fibbi(@PathVariable int nthNum){
        int fibNum = restDemoService.fibonacci(nthNum);
        return "The " + nthNum + "th number of the Fibonacci Sequence is " + fibNum;
    }

}
