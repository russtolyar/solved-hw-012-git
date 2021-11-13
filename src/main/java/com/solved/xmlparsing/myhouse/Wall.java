package com.solved.xmlparsing.myhouse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

//@XmlAccessorType(XmlAccessType.FIELD)
public class Wall {

    private String materialWall;

    public Wall() {
    }

    public void setMaterialWall(String materialWall) {
        this.materialWall = materialWall;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "materialWall='" + materialWall + '\'' +
                '}';
    }
}

