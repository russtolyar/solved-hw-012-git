package com.solved.xmlparsing.myhouse;

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

