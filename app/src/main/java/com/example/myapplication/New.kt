package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class New : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        val btn=findViewById<Button>(R.id.exbtn)
        btn.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)

        }
    }
}



