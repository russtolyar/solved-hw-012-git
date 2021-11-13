package com.solved.xmlparsing.myhouse;

public class MainClass {

    public static void main(String[] args) {

        String fileName = "src/main/resources/house.xml";

        System.out.println("\t\t\tStAX parser\n");
        MySTAXParserImpl mySTAXParser = new MySTAXParserImpl();
        System.out.println(mySTAXParser.parse(fileName));

        System.out.println("\n\n\t\t\tJaxb parser\n");
        MyJaxbParserImpl myJaxbParserImpl = new MyJaxbParserImpl();
        System.out.println(myJaxbParserImpl.parse(fileName));

    }
}

