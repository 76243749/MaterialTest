package com.myandroid.materialtest;

/**
 * Created by Huochai on 2018/11/17.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setImageId(int imageId){
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
