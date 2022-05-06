package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.example.myassignment.AppDatabase;
import com.example.myassignment.Cafes;
import com.example.myassignment.CafeDAO;

public class FavouritesActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private CafeDAO mCafeDAO;
    private RecyclerView favRecycler;

    private String data[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        favRecycler = findViewById(R.id.favouritesRecycler);

        //Fetch views
        data = getResources().getStringArray(R.array.fav_list);

        //Initialise recycler view adapter
        FavAdapter favAdapter = new FavAdapter(this, data);
        favRecycler.setAdapter(favAdapter);
        favRecycler.setLayoutManager(new LinearLayoutManager(this));

        //Connect this activity to the database
        mCafeDAO = Room.databaseBuilder(this, AppDatabase.class, "db-cafe")
                .allowMainThreadQueries()
                .build()
                .getCafeDAO();

        //Load the users favourite cafes
        loadFavourites();

    }

    private void loadFavourites(){
        mCafeDAO.getFavourites();
    }

}