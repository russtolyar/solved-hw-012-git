//package com.solved.xmlparsing.myhouse;
//
//import javax.xml.stream.XMLInputFactory;
//import javax.xml.stream.XMLStreamException;
//import javax.xml.stream.XMLStreamReader;
//import javax.xml.stream.events.XMLEvent;
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class StaxStreamProcessor implements AutoCloseable {
//    private static final XMLInputFactory FACTORY = XMLInputFactory.newInstance();
//
//    private final XMLStreamReader reader;
//
//    public StaxStreamProcessor(InputStream is) throws XMLStreamException {
//        reader = FACTORY.createXMLStreamReader(is);
//    }
//
//    public XMLStreamReader getReader() {
//        return reader;
//    }
//
//    public boolean doUntil(int stopEvent, String value) throws XMLStreamException {
//        while (reader.hasNext()) {
//            int event = reader.next();
//            if (event == stopEvent && value.equals(reader.getLocalName())) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean startElement(String element, String parent) throws XMLStreamException {
//        while (reader.hasNext()) {
//            int event = reader.next();
//            if (parent != null && event == XMLEvent.END_ELEMENT &&
//                    parent.equals(reader.getLocalName())) {
//                return false;
//            }
//            if (event == XMLEvent.START_ELEMENT &&
//                    element.equals(reader.getLocalName())) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public String getAttribute(String name) throws XMLStreamException {
//        return reader.getAttributeValue(null, name);
//    }
//    public String getText() throws XMLStreamException {
//        return reader.getElementText();
//    }
//
//    @Override
//    public void close() throws IOException, XMLStreamException {
//        if (reader != null) {
//            try {
//                reader.close();
//            } catch (XMLStreamException e) {
//            }
//        }
////    }
//    try (StaxStreamProcessor processor = new StaxStreamProcessor(Files.newInputStream(Paths.get("house.xml")))) {
//        XMLStreamReader reader = processor.getReader();
//        while (reader.hasNext()) {       // while not end of XML
//            int event = reader.next();   // read next event
//            if (event == XMLEvent.START_ELEMENT &&
//                    "house".equals(reader.getLocalName())) {
//                System.out.println(reader.getElementText());
//            }
//        }
//        while (processor.doUntil(XMLEvent.START_ELEMENT, "house")){
//            System.out.println(reader.getElementText());
//        }
//        while (processor.startElement("house", "")) {
//            System.out.println(processor.getAttribute("id") +":" + processor.getText());
//        }
//
//    }
//    }
//}
