package com.shoppingapp.com.shoppingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void login () {
        Toast.makeText(this, "lol", Toast.LENGTH_SHORT).show();
    }
}
