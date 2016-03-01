package com.thirdpinion.schematool;

import junit.framework.Assert;
import org.apache.avro.Schema;
import org.junit.Test;

/**
 * Created by uclayal on 2/29/16.
 */
public class BasicParsingTest {

    @Test
    public void testBasicParsing() {
        Schema.Parser parser = new Schema.Parser();
        Schema result = parser.parse("{\n" +
                "    \"type\" : \"record\",\n" +
                "    \"name\" : \"userInfo\",\n" +
                "    \"namespace\" : \"my.example\",\n" +
                "    \"fields\" : [{\"name\" : \"age\", \"type\" : \"int\"}]\n" +
                "} ");
        Assert.assertEquals("{\"type\":\"record\",\"name\":\"userInfo\",\"namespace\":\"my.example\",\"fields\":[{\"name\":\"age\",\"type\":\"int\"}]}",result.toString());
        Assert.assertEquals("my.example.userInfo",result.getFullName());
        Assert.assertEquals(false, result.isError());
    }
}
