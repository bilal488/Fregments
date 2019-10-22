package com.example.smarttechmardan.fregments;

/**
 * Created by Bilal on 8/15/2017.
 */

public class ItemObject1 {
    private int screeenShot1;
    private  String musicName1;
    private  String musicAuthor1;

    public ItemObject1(int screeenShot, String musicName,String musicAuthor){
        this.screeenShot1 = screeenShot;
        this.musicName1 = musicName;
        this.musicAuthor1 = musicAuthor;
    }

    public int getScreeenShot(){
        return screeenShot1;

    }

    public String getMusicName(){
        return musicName1;
    }

    public String getMusicAuthor(){
        return musicAuthor1;
    }
}
