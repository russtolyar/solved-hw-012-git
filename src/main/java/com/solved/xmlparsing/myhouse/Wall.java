package com.solved.xmlparsing.myhouse;

public class Wall {

    private String materialWall;

    public Wall() {
    }

    public Wall(String materialWall) {
        this.materialWall = materialWall;
    }

    public String getMaterialWall() {
        return materialWall;
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

