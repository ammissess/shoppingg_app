package com.example.shoppingapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class zephyrusg16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_zephyrusg16)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))

        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        clickListener()

    }
    public fun  clickListener() {
        var     iconbackimg = findViewById<ImageView>(R.id.backkicon);

        iconbackimg.setOnClickListener {
            openHomePageActivity()
        }

    }

    public fun openHomePageActivity(){
        startActivity(Intent(this@zephyrusg16, MainActivity::class.java))

    }

}