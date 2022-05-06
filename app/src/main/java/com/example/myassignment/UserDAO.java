package com.example.myassignment;
import com.example.myassignment.User;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Insert;
import androidx.room.Delete;

@Dao
public interface UserDAO {

    @Insert
    public void insert(User... users);

    @Update
    public void update(User... users);

    @Delete
    public void delete(User user);

}
