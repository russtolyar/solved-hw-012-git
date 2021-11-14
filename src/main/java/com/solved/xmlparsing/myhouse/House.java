package com.solved.xmlparsing.myhouse;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("house")
@XmlRootElement
public class House {

    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dob;
    private Stage stage;
    private int countStage;

    public House() {
    }

    public void setDob(LocalDateTime dob) {
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

