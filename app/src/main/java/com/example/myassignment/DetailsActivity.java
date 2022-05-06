package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    private TextView textViewTitle, textViewDetails;
    private ImageView mainImageView;

    private String data1, data2;
    private int myImage;
    private String mActivity = "DetailsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textViewTitle = findViewById(R.id.detailName);
        textViewDetails = findViewById(R.id.detailDesc);
        mainImageView = findViewById(R.id.imageViewDetail);

        getData();
        setData();

        //Connect this activity to the database
    }

    private void getData(){
        if(getIntent().hasExtra("data1") && getIntent().hasExtra("data2")
        && getIntent().hasExtra("myImage")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);
        } else{
            Toast.makeText(this, "data does not exist", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        textViewTitle.setText(data1);
        textViewDetails.setText(data2);
        mainImageView.setImageResource(myImage);
    }

    public void onClickFavourite(View view){

        Toast.makeText(this, "Added to favourites!", Toast.LENGTH_SHORT).show();
        Log.i("Item added to favourites", mActivity);

        //Insert data[position] into the favourites column
    }



}