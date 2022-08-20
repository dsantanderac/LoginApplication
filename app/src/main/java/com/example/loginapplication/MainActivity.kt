package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View){

        val user = findViewById<EditText>(R.id.txt_user).text.toString();
        val pass = findViewById<EditText>(R.id.txt_pass).text.toString();

        val bundle = Bundle();

        bundle.putString("user", user);
        bundle.putString("pass", pass);

        val intent = Intent(this, HomeActivity::class.java);
        intent.putExtras(bundle);

        //Log.i("DSA", user); // Log informativo
        //Log.i("DSA", pass); // Log informativo
        if (pass == "admin"){
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
        }
    }
}