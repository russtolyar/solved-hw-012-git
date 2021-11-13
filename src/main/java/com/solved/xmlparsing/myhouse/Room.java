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

    public Room(Wall wall, String roomType, Ceiling ceiling) {
        this.wall = wall;
        this.roomType = roomType;
        this.ceiling = ceiling;
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


    public Wall getWall() {
        return wall;
    }

    public String getRoomType() {
        return roomType;
    }

    public Ceiling getCeiling() {
        return ceiling;
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

