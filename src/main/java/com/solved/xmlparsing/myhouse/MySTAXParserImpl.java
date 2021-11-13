package com.solved.xmlparsing.myhouse;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MySTAXParserImpl implements Parsable {

    @Override
    public House parse(String fileName) {

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
                            house = new House();
                            break;

                        case "stage":
                            stage = new Stage();
                            assert house != null;
                            house.setStage(stage);
                            stage.setFlats(flats);
                            break;

                        case "flat":
                            flat = new Flat();
                            flat.setRooms(rooms);
                            break;

                        case "room":
                            room = new Room();
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
                            house.setDob(date);
                            break;

                        default:
                            break;
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    String fName = endElement.getName().getLocalPart();
                    if (fName.equals("room")) {
                        rooms.add(room);

                    } else if (fName.equals("rooms")) {
                        rooms = new ArrayList<>();

                    } else if (xmlEvent.isEndElement()) {
                        if (fName.equals("flat")) {
                            flats.add(flat);
                        }
                    }
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return house;
    }
}