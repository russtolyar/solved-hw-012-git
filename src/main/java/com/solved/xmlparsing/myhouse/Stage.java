package com.solved.xmlparsing.myhouse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class Stage {

    @XmlElementWrapper(name = "flats")
    @XmlElement(name = "flat")
    private List<Flat> flats;

    public Stage() {
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

