package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class WebSearchActivity extends AppCompatActivity {

    private EditText mWebsiteTextEdit;
    private final String mActivity = "WebSearchActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_search);

        mWebsiteTextEdit = findViewById(R.id.editTextWeb);
    }

    public void openBrowser(View view){

        String url = mWebsiteTextEdit.getText().toString();
        Uri page = Uri.parse(url);

        Intent intent = new Intent(Intent.ACTION_VIEW, page);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
        else{
            Log.i("No search results for" + " ", mActivity);
        }

    }
}