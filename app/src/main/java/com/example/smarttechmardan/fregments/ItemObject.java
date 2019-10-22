package com.example.smarttechmardan.fregments;

/**
 * Created by Smart Tech  Mardan on 7/18/2017.
 */

public class ItemObject {
    private int screeenShot;
    private  String musicName;
    private  String musicAuthor;

    public ItemObject(int screeenShot, String musicName,String musicAuthor){
        this.screeenShot = screeenShot;
        this.musicName = musicName;
        this.musicAuthor = musicAuthor;
    }

    public int getScreeenShot(){
        return screeenShot;

    }

    public String getMusicName(){
        return musicName;
    }

    public String getMusicAuthor(){
        return musicAuthor;
    }
}
