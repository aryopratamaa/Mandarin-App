package com.aryo.mandarinapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.widget.Toast

class RegulerDewasa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reguler_dewasa)

        val btnDewasaOnsite = findViewById<Button>(R.id.btnDewasaOnsite)
        btnDewasaOnsite.setOnClickListener {
            val intent = Intent(this, dewasa_onsite::class.java)
            startActivity(intent)
        }

        val btnDewasaOnline = findViewById<Button>(R.id.btnDewasaOnline)
        btnDewasaOnline.setOnClickListener {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}