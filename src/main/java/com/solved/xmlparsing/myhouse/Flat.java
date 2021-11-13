package com.solved.xmlparsing.myhouse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Flat {

    @XmlElementWrapper(name = "rooms")
    @XmlElement(name = "room")
    private List<Room> rooms;

    public Flat() {
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "\n\tFlat{" +
                "\n\t\trooms=" + rooms +
                '}';
    }
}
