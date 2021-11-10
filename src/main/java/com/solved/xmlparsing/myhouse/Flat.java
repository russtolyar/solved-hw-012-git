package com.solved.xmlparsing.myhouse;

import java.util.List;

public class Flat {

    private List<Room> rooms;

    public Flat() {
    }

    public Flat(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "rooms=" + rooms +
                '}';
    }
}
