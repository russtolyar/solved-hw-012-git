package com.solved.xmlparsing.myhouse;


import java.time.LocalTime;

public class House {

    private static final LocalTime DOB = LocalTime.now();


    private Stage stage;
    private int countStage;

    public House() {
    }

    public House(Stage stage, int countStages) {
        this.stage = stage;
        this.countStage = countStages;
    }

    public static LocalTime getDOB() {
        return DOB;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public int getCountStage() {
        return countStage;
    }

    public void setCountStage(int countStage) {
        this.countStage = countStage;
    }

    @Override
    public String toString() {
        return "House{" +
                "stage=" + stage +
                ", countStage=" + countStage +
                '}';
    }
}

