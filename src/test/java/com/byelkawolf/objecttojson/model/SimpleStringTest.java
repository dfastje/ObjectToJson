package com.byelkawolf.objecttojson.model;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleStringTest {

    private final String testStringJson = "{\"simpleString\":\"testString\"}";
    private final String testString = "testString";

    @Before
    public void setup(){

    }


    @Test
    public void convertToJson(){
        SimpleString simpleString = SimpleString.convertFromJson(testStringJson);

        Assert.assertNotNull(simpleString);
        Assert.assertEquals( testString, simpleString.getSimpleString() );

    }

    @Test
    public void convertFromJson(){
        SimpleString simpleString = new SimpleString(testString);
        String outputString = SimpleString.convertToJson(simpleString);

        Assert.assertEquals( testStringJson, outputString );
    }

    @After
    public void close(){

    }
}
