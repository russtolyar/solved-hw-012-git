package com.solved.xmlparsing.myhouse;

public class Ceiling {


    private String colorCeiling;

    public Ceiling() {
    }

    public Ceiling(String colorCeiling) {
        this.colorCeiling = colorCeiling;
    }

    public String getColorCeiling() {
        return colorCeiling;
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
