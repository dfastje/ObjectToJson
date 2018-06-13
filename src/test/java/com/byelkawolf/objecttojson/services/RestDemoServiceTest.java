package com.byelkawolf.objecttojson.services;

import com.byelkawolf.objecttojson.model.SimpleString;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RestDemoServiceTest {

    private RestDemoService restDemoService;

    @Before
    public void setup(){
        restDemoService = new RestDemoService();
    }

    @Test
    public void simpleStringProcessorTest(){
        String testString = "testString";
        SimpleString simpleString = new SimpleString(testString);

        String outputString = restDemoService.simpleStringProcessor(
                SimpleString.convertToJson(simpleString)
        );

        Assert.assertEquals(outputString,
                SimpleString.convertToJson(simpleString));
    }

    @After
    public void close(){

    }

}
