package com.solved.xmlparsing.myhouse;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
public class Ceiling {

    private String colorCeiling;

    public Ceiling() {
    }

    public void setColorCeiling(String colorCeiling) {
        this.colorCeiling = colorCeiling;
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "colorCeiling='" + colorCeiling + '\'' +
                '}';
    }
}
