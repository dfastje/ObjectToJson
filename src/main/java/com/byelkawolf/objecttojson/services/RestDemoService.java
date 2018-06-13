package com.byelkawolf.objecttojson.services;


import com.byelkawolf.objecttojson.model.SimpleString;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class RestDemoService {

    Gson gson = new Gson();

    public String simpleStringProcessor(String jsonString){
        SimpleString simpleStringInstance = SimpleString.convertFromJson(jsonString);
        return SimpleString.convertToJson(simpleStringInstance);
    }

}
