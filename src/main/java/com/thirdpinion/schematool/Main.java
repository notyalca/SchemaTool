package com.thirdpinion.schematool;

import org.apache.avro.Schema;

public class Main {

    public static void main(String[] args) {
        Schema.Parser parser = new Schema.Parser();
        Schema result = parser.parse("{\n" +
                "    \"type\" : \"record\",\n" +
                "    \"name\" : \"userInfo\",\n" +
                "    \"namespace\" : \"my.example\",\n" +
                "    \"fields\" : [{\"name\" : \"age\", \"type\" : \"int\"}]\n" +
                "} ");
        System.out.println(result);
        System.out.println(result.getFullName());
    }
}
