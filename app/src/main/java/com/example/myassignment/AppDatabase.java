package com.example.myassignment;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myassignment.User;
import com.example.myassignment.Cafes;

@Database(entities = {User.class, Cafes.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract CafeDAO getCafeDAO();
    public abstract UserDAO getUserDAO();

}
