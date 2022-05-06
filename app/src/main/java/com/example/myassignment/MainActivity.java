package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String mActivity = "Main Activity";
    private String TAG = "Class";

    private Button menuButton;

    //Lifecycle methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuButton = findViewById(R.id.btn1);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, mActivity + "" + "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, mActivity + "" + "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, mActivity + "" + "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, mActivity + "" + "onStop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, mActivity + "" + "onRestart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, mActivity + "" + "onDestroy");
    }

    //On click methods
    public void onClickMenu(View view){

        Intent intent = new Intent(this, MenuActivity.class);
        Log.i("Button clicked", "redirect to menu activity");
        //Redirect user to the menu
        startActivity(intent);

    }
}