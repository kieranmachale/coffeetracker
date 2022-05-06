package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.myassignment.AppDatabase;
import com.example.myassignment.Cafes;
import com.example.myassignment.CafeDAO;
import androidx.room.Room;

public class ProfileInfoActivity extends AppCompatActivity {

    private Button submit;
    private EditText mEnterName, mEnterUsername, mEnterPassword, mEnterEmail;
    private UserDAO mUserDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_info);

        submit = findViewById(R.id.btn3);
        mEnterName = findViewById(R.id.editTextName);
        mEnterUsername = findViewById(R.id.editTextUsername);
        mEnterPassword = findViewById(R.id.editTextPassword);
        mEnterEmail = findViewById(R.id.editTextEmail);

        //Connect this activity to the database
        mUserDAO = Room.databaseBuilder(this, AppDatabase.class, "db-user")
                .allowMainThreadQueries()
                .build()
                .getUserDAO();
    }

    public void onClickSubmit(View view){

        //Retrieving user input
        String name = mEnterName.getText().toString();
        String username = mEnterUsername.getText().toString();
        String password = mEnterPassword.getText().toString();
        String email = mEnterEmail.getText().toString();

        if(name.length() == 0 || username.length() == 0 || password.length() == 0
        || email.length() == 0){

            Context context = getApplicationContext();
            CharSequence text = "Please complete the form!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else{

            //Creating new intent
            Intent submitIntent = new Intent(this, ProfileActivity.class);

            //Putting user info in a bundle for next activity
            Bundle extras = new Bundle();
            extras.putString("Name", name);
            extras.putString("Username", username);
            extras.putString("Password", password);
            extras.putString("Email", email);
            submitIntent.putExtras(extras);

            //Redirecting to profile with users info
            startActivity(submitIntent);
        }
    }
}