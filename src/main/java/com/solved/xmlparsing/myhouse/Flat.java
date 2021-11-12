package com.solved.xmlparsing.myhouse;

import java.util.List;

public class Flat {

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
