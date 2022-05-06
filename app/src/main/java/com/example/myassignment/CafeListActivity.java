package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CafeListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private String shops[], descriptions[];
    private int images[] = {R.drawable.amt, R.drawable.aroma, R.drawable.caribou, R.drawable.costa,
    R.drawable.insomnia, R.drawable.luckin, R.drawable.nero, R.drawable.portcity, R.drawable.starbucks,
    R.drawable.tchibo, R.drawable.timhortons, R.drawable.woods};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_list);

        recyclerView = findViewById(R.id.recyclerView);

        shops = getResources().getStringArray(R.array.cafe_shops);
        descriptions = getResources().getStringArray(R.array.shop_description);

        MyAdapter myAdapter = new MyAdapter(this, shops, descriptions, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}