package com.byelkawolf.objecttojson.model;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SimpleString {

    String simpleString;

    private static Gson gson = new Gson();

    public static String convertToJson(SimpleString simpleString){
        return gson.toJson( simpleString );
    }

    public static SimpleString convertFromJson(String jsonString){
        return gson.fromJson(jsonString, SimpleString.class);
    }
}
