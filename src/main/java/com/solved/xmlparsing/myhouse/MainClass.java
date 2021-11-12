package com.solved.xmlparsing.myhouse;

public class MainClass {

    public static void main(String[] args) {

        MySTAXParserImpl mySTAXParser = new MySTAXParserImpl();

        String fileName = "src/main/resources/house.xml";

        System.out.println(mySTAXParser.parse(fileName));


    }
}

