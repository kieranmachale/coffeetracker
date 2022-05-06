package com.example.myassignment;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Insert;
import androidx.room.Delete;

import java.util.List;

@Dao
public interface CafeDAO {

    @Insert
    public void insert(Cafes...cafes);

    @Update
    public void update(Cafes...cafes);

    @Delete
    public void delete(Cafes cafe);

    //Return all rows from the cafe table
    @Query("SELECT * FROM Cafes")
    public List<Cafes> getAllCafes();

    //Return rows from a certain location
    /*
    @Query("SELECT cafe_name FROM Cafes WHERE location = :editTextLocation")
    public List<Cafes> getCafesFrom(String editTextLocation);*/

    //Return a description of a specified cafe
    /*
    @Query("SELECT description FROM Cafes WHERE cafe_name = :editTextCafe")
    public String getDescription(String editTextCafe);*/

    //Return the cafes that the user added to favourites
    @Query("SELECT * FROM Cafes WHERE favourite = 'true'")
    public List<Cafes> getFavourites();

}
