//Class to represent the cafe table
package com.example.myassignment;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="Cafes")
public class Cafes {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int cid;

    @ColumnInfo(name="cafe_name")
    @NonNull
    private String cname;

    @ColumnInfo(name="description")
    @NonNull
    private String description;

    @ColumnInfo(name="location")
    @NonNull
    private String location;

    @ColumnInfo(name="year_founded")
    @NonNull
    private int year;

    @ColumnInfo(name="favourite")
    private boolean favourite;

    //Getters and setters
    public int getCid(){
        return cid;
    }

    public void setCid(int cid){
        this.cid = cid;
    }

    public String getCname(){
        return cname;
    }

    public void setCname(String cname){
        this.cname = cname;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean getFavourite(){ return favourite; }

    public void setFavourite(boolean favourite) {this.favourite = favourite;}



    //Constructor for cafe
    public Cafes(){

    }
}
