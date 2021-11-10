package com.solved.xmlparsing.myhouse;

public class Room {

    private Wall wall;
    private String roomType;
    private Ceiling ceiling;

    public Room() {
    }

    public Room(Wall wall, String roomType, Ceiling ceiling) {
        this.wall = wall;
        this.roomType = roomType;
        this.ceiling = ceiling;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public String toString() {
        return "Room{" +
                "wall=" + wall +
                ", roomType='" + roomType + '\'' +
                ", ceiling=" + ceiling +
                '}';
    }
}

