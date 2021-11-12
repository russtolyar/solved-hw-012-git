package com.solved.xmlparsing.myhouse;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySTAXParserImpl implements Parsable {

    String fileName = "src/main/resources/house.xml";

    @Override
    public House parse(String fileName) {

        System.out.println("Hello");

        House house = null;
        Stage stage;
        List<Flat> flats = new ArrayList<>();
        Flat flat = null;
        List<Room> rooms = new ArrayList<>();
        Room room = null;
        Ceiling ceiling;
        Wall wall;

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            while (reader.hasNext()) {
                XMLEvent xmlEvent = reader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    String qName = startElement.getName().getLocalPart();

                    switch (qName) {

                        case "house":
                            System.out.println("Start element HOUSE");
                            house = new House();
                            break;

                        case "stage":
                            System.out.println("Start element STAGE");
                            stage = new Stage();
                            assert house != null;
                            house.setStage(stage);
                            stage.setFlats(flats);
                            break;

                        case "flat":
                            System.out.println("Start element FLAT");
                            flat = new Flat();
                            Iterator<Attribute> attributes = startElement.getAttributes();
                            String No = attributes.next().getValue();
                            System.out.println(" No : " + No);
                            flat.setRooms(rooms);
                            break;

                        case "room":
                            System.out.println("Start element ROOM");
                            room = new Room();
                            Iterator<Attribute> attributeR = startElement.getAttributes();
                            String type = attributeR.next().getValue();
                            System.out.println(" Room-type : " + type);
                            break;

                        case "colorCeiling":
                            xmlEvent = reader.nextEvent();
                            ceiling = new Ceiling();
                            ceiling.setColorCeiling(xmlEvent.asCharacters().getData());
                            assert room != null;
                            room.setCeiling(ceiling);
                            break;

                        case "roomType":
                            xmlEvent = reader.nextEvent();
                            assert room != null;
                            room.setRoomType(xmlEvent.asCharacters().getData());
                            break;

                        case "materialWall":
                            xmlEvent = reader.nextEvent();
                            wall = new Wall();
                            wall.setMaterialWall(xmlEvent.asCharacters().getData());
                            assert room != null;
                            room.setWall(wall);
                            break;

                        case "countStage":
                            xmlEvent = reader.nextEvent();
                            assert house != null;
                            house.setCountStage(Integer.parseInt(xmlEvent.asCharacters().getData()));
                            break;

                        case "dob":
                            xmlEvent = reader.nextEvent();
                            assert house != null;
                            String dob = xmlEvent.asCharacters().getData();
                            LocalDate date = LocalDate.parse(dob, DateTimeFormatter.ISO_LOCAL_DATE);
                            house.setDOB(date);
                            break;
//                            case "dateOfBirth":
//                        try {
//                            nextEvent = reader.nextEvent();
//                        } catch (XMLStreamException e) {
//                            e.printStackTrace();
//                        }
//                        String dob = nextEvent.asCharacters().getData();
//                        LocalDate date = LocalDate.parse(dob, DateTimeFormatter.ISO_LOCAL_DATE);
//                        soldier.setDob(date);
//                        break;
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    String fName = endElement.getName().getLocalPart();
                    if (fName.equals("room")) {
                        rooms.add(room);
                        System.out.println("Room completed ");

                    } else if (xmlEvent.isEndElement()) {
                        if (fName.equals("flat")) {
                            flats.add(flat);
                            System.out.println("Flat completed ");
                            flats = new ArrayList<>();
                        }

                    } else if (xmlEvent.isEndElement()) {
                        if (fName.equals("stage")) {
                            System.out.println("Stage completed ");
                        }
                    }
                }
            }
        } catch (
                XMLStreamException |
                        FileNotFoundException e) {
            e.printStackTrace();
        }
        return house;
    }
}