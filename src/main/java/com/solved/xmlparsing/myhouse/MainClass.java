package com.solved.xmlparsing.myhouse;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

        String fileName = "src/main/resources/house.xml";

        System.out.println("\t\t\tStAX parser\n");
        MySTAXParserImpl mySTAXParser = new MySTAXParserImpl();
        System.out.println(mySTAXParser.parse(fileName));

        System.out.println("\n\n\t\t\tJaxb parser\n");
        MyJaxbParserImpl myJaxbParserImpl = new MyJaxbParserImpl();
        System.out.println(myJaxbParserImpl.parse(fileName));

        String filePath = "src/main/resources/house.json";

        System.out.println("\n\n\t\t\tJackson parser\n");
        MyJacksonParserImpl myJacksonParser = new MyJacksonParserImpl();
        try {
            System.out.println(myJacksonParser.parse(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

