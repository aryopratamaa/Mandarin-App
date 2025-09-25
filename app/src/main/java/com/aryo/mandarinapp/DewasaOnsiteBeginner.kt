package com.aryo.mandarinapp

import android.content.Intent
import android.widget.Button
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DewasaOnsiteBeginner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dewasa_onsite_beginner)

        val btnPilihKelasA = findViewById<Button>(R.id.btnKelasA)
        val noHp = "6282161965317"
        val teks = "Halo, saya ingin memilih kelas beginner A untuk kelas onsite Mandarin App"
        btnPilihKelasA.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$noHp?text=$teks")
            startActivity(intent)
        }

        val btnPilihKelasB = findViewById<Button>(R.id.btnKelasB)
        val noHp2 = "6282161965317"
        val teks2 = "Halo, saya ingin memilih kelas beginner B untuk kelas onsite Mandarin App"
        btnPilihKelasB.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$noHp2?text=$teks2")
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}