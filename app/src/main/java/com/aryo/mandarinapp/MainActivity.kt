package com.aryo.mandarinapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.net.Uri
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
        val btnSemuaMentor = findViewById<Button>(R.id.btnSemuaMentor)
        val btnDaring = findViewById<Button>(R.id.btnDaring)
        val btnPrivate = findViewById<Button>(R.id.btnPrivate)
        val btnTelpon = findViewById<Button>(R.id.btnTelpon)



        btnDewasa.setOnClickListener {
            val intent = Intent(this, dewasa::class.java)
            startActivity(intent)
        }

        btnAnak.setOnClickListener {
            Toast.makeText(this, "Masih masa pengembangan", Toast.LENGTH_SHORT).show()
        }

        btnPrivate.setOnClickListener {
            Toast.makeText(this, "Masih masa pengembangan", Toast.LENGTH_SHORT).show()
        }

        btnPerpus.setOnClickListener {
            val intent = Intent(this, Perpustakaan::class.java)
            startActivity(intent)
        }

        btnJadwal.setOnClickListener {
            val intent = Intent(this, JadwalBiaya::class.java)
            startActivity(intent)
        }

        btnSemuaMentor.setOnClickListener {
            val intent = Intent(this, Mentor::class.java)
            startActivity(intent)
        }

        btnDaring.setOnClickListener {
            val intent = Intent(this, DetailKelasOnline::class.java)
            startActivity(intent)
        }

        btnTelpon.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:085158335498")
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}