package com.solved.xmlparsing.myhouse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

public class MyJacksonParserImpl implements Parsable {

    @Override
    public House parse(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        File file = new File(filePath);

        House house = mapper.readValue(file, House.class);
        return house;
    }
}
