package com.example.shoppingapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        clickListener()
    }
    public fun  clickListener() {
        var     imgzephyrusg16 = findViewById<ImageView>(R.id.zephyrussg16);

        imgzephyrusg16.setOnClickListener {
            openZephyrusActivity()
        }

    }

    public fun openZephyrusActivity(){
        startActivity(Intent(this@MainActivity, zephyrusg16::class.java))

    }

}