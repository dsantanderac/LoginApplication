package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val extras = intent.extras;
        var user = "";
        var pass = "";

        if (extras != null){
            user = extras.getString("user").toString();
            pass = extras.getString("pass").toString();

            this.supportActionBar!!.title = user;
            this.supportActionBar!!.setDisplayHomeAsUpEnabled(true);
            this.supportActionBar!!.setDisplayShowHomeEnabled(true);
        }
    }
}