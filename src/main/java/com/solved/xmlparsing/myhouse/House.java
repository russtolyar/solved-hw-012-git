package com.solved.xmlparsing.myhouse;

import java.time.LocalDate;

public class House {

    private LocalDate DOB;

    private Stage stage;
    private int countStage;

    public House() {
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setCountStage(int countStage) {
        this.countStage = countStage;
    }

    @Override
    public String toString() {
        return "House{\n" +
                "DOB=" + DOB +
                ", \nstage=" + stage +
                ", \ncountStage=" + countStage +
                '}';
    }
}

