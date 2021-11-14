package com.solved.xmlparsing.myhouse;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Room {

    @XmlElement(name = "wall")
    private Wall wall;
    @XmlElement(name = "roomType")
    private String roomType;
    @XmlElement(name = "ceiling")
    private Ceiling ceiling;

    public Room() {
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public String toString() {
        return "\nRoom{" +
                "\n\t\twall=" + wall +
                ", roomType='" + roomType + '\'' +
                ", ceiling=" + ceiling +
                '}';
    }
}

