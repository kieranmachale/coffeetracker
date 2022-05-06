package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    private final String mActivity = "Menu Activity";
    private final String TAG = "Class";

    private ImageView profileImg, cafeImg, langImg, webImg;
    private boolean firstVisit = true;

    //Lifecycle methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {

            Log.i(TAG, "set first visit to false");
        }

        setContentView(R.layout.activity_menu);

        profileImg = findViewById(R.id.imageProfile);
        cafeImg = findViewById(R.id.imageCafe);
        langImg = findViewById(R.id.imageLanguage);
        webImg = findViewById(R.id.imageWebSearch);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        firstVisit = false;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("first_visit_state", "false");

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
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
    public void onClickProfile(View view){

        if(firstVisit){
            firstVisit = false;
            Intent profileInfoIntent = new Intent(this, ProfileInfoActivity.class);
            startActivity(profileInfoIntent);
        } else{
            Intent profileIntent = new Intent(this, ProfileActivity.class);
            startActivity(profileIntent);
            Log.i("Profile image clicked", "redirect to profile activity");
        }
    }

    public void onClickCafe(View view){

        Intent cafeIntent = new Intent(this, CafeListActivity.class);
        startActivity(cafeIntent);
        Log.i("Cafe image clicked", "redirect to cafe list activity");
    }

    public void onClickLanguages(View view){

        Intent langIntent = new Intent(this, LanguageActivity.class);
        startActivity(langIntent);
        Log.i("Language image clicked", "redirect to language selection");
    }

    public void onClickWebSearch(View view){

        Intent webIntent = new Intent(this, WebSearchActivity.class);
        startActivity(webIntent);
        Log.i("Web search image clicked", "redirect to web search activity");
    }

    public void onClickReturn(View view){

        Intent returnIntent = new Intent(this, MainActivity.class);
        startActivity(returnIntent);
    }
}