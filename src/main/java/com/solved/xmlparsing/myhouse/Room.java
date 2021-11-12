package com.solved.xmlparsing.myhouse;

public class Room {

    private Wall wall;
    private String roomType;
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

