package com.aryo.mandarinapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnDewasa = findViewById<Button>(R.id.btnDewasa)
        val btnAnak = findViewById<Button>(R.id.btnAnak)
        val btnPerpus = findViewById<Button>(R.id.btnPerpus)
        val btnJadwal = findViewById<Button>(R.id.btnJadwal)

        btnDewasa.setOnClickListener {
            val intent = Intent(this, dewasa::class.java)
            startActivity(intent)
        }

        btnAnak.setOnClickListener {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()
        }

        btnPerpus.setOnClickListener {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()
        }

        btnJadwal.setOnClickListener {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show()
        }

        val btnSemuaMentor = findViewById<Button>(R.id.btnSemuaMentor)
        btnSemuaMentor.setOnClickListener {
            val intent = Intent(this, Mentor::class.java)
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}