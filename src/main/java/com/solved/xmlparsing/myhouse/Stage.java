package com.solved.xmlparsing.myhouse;


import java.util.List;

public class Stage {

    private List<Flat> flats;

    public Stage() {
    }

    public Stage(List<Flat> flats) {
        this.flats = flats;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "flats=" + flats +
                '}';
    }
}

