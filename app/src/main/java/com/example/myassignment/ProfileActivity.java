package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ProfileActivity extends AppCompatActivity {

    private String nameString, usernameString, passwordString, emailString;
    private TextView nameTextView, usernameTextView;
    private String editTextLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {

        }

        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        nameString = extras.getString("Name");
        usernameString = extras.getString("Username");
        passwordString = extras.getString("Password");
        emailString = extras.getString("Email");

        //Finding views from profile page
        nameTextView = findViewById(R.id.textViewName);
        usernameTextView = findViewById(R.id.textViewUsername);

        //Set text of profile page
        nameTextView.setText(nameString);
        usernameTextView.setText(usernameString);
    }

    public void onClickFavourites(View view){

        //Redirect to favourites page
        Intent favouritesIntent = new Intent(this, FavouritesActivity.class);
        startActivity(favouritesIntent);
    }

}