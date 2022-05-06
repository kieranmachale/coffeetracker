//Class to represent the user table
package com.example.myassignment;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

@Entity(tableName="User")
public class User {

    @PrimaryKey(autoGenerate=true)
    @NonNull
    private int uid;

    @ColumnInfo(name="full_name")
    @NonNull
    private String name;

    @ColumnInfo(name="user_name")
    @NonNull
    private String username;

    @ColumnInfo(name="user_password")
    @NonNull
    private String password;

    @ColumnInfo(name="user_email")
    @NonNull
    private String email;

    //Getters and setters
    public int getUid(){
        return uid;
    }

    public void setUid(int uid){
        this.uid = uid;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }


    //Constructor for user
    public User(){

    }
}
