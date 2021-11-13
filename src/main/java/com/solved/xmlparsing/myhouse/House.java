package com.solved.xmlparsing.myhouse;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


@XmlRootElement(name = "house")
@XmlAccessorType(XmlAccessType.FIELD)
public class House {

    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dob;
    private Stage stage;
    private int countStage;

    public House() {
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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
                "DOB=" + dob +
                ", \nstage=" + stage +
                ", \ncountStage=" + countStage +
                '}';
    }
}

