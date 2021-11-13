package com.solved.xmlparsing.myhouse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MyJaxbParserImpl implements Parsable{
    @Override
    public House parse(String fileName) {

        File xmlFile = new File(fileName);
        JAXBContext jaxbContext;

        try {
            jaxbContext = JAXBContext.newInstance(House.class);
            Unmarshaller unmarshallerJaxb = jaxbContext.createUnmarshaller();
            House house = (House) unmarshallerJaxb.unmarshal(xmlFile);
            return house;

        } catch (JAXBException e) {
           //Logger.get metod + message  or  runtime Exception(e.message)
            e.printStackTrace();
        }
        return null;
    }
}
